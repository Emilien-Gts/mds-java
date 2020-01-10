package fr.mds.travelagencyproject.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import fr.mds.travelagencyproject.db.ConnectionManager;

public class JdbcPlaceDao implements PlaceDao{

	@Override
	public long createPlace(Place p) {
		long id = 0;
		
		try {			
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			Statement state = connection.createStatement();
		    state.executeUpdate("INSERT INTO places (name) " + "VALUES ('"+p.getName()+"')");
		    
		    Statement state2 = connection.createStatement();
		    ResultSet result = state2.executeQuery("SELECT id FROM places ORDER BY id DESC");
		    
		    if(result.next()){ 
        		id = result.getInt(1);
		    }
		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
		
		return id;
	}

	@Override
	public Place findPlaceById(Long id) {
		int idPlace = 0;
		String namePlace = null;
		
		try {				
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			//Statement + ResultSet
			Statement state = connection.createStatement();
		    ResultSet result = state.executeQuery("SELECT * FROM places WHERE id='"+id+"'");
		    
		    //Result
		    if(result.next()){ 
        		idPlace = result.getInt(1);
        		namePlace = result.getString(2);
		    }		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
		
		return new Place(idPlace, namePlace);
	}

	@Override
	public void updatePlace(Place p) {
		long id = 0;
		try {			
			
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			//Statement
			Statement state = connection.createStatement();
		    state.executeUpdate("UPDATE places SET name = '"+ p.getName() +"' WHERE id='"+ p.getId() +"'");
		    
		    findPlaceById(p.getId());
		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
	}

	@Override
	public void removePlace(Long id) {
		try {			
			
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			//Statement
			Statement state = connection.createStatement();
		    state.executeUpdate("DELETE FROM places WHERE id='"+ id +"'");
		    
		    findPlaceById(id);
		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
	}

}
