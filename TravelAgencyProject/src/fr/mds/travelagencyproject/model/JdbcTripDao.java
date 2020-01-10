package fr.mds.travelagencyproject.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.mds.travelagencyproject.db.ConnectionManager;

public class JdbcTripDao implements TripDao{

	@Override
	public Long createTrip(Trip t) {
		long id = 0;
		
		try {			
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			Statement state = connection.createStatement();
		    state.executeUpdate("INSERT INTO trips (departure_fk, destination_fk, price) " + "VALUES ('"+t.getDeparture().getId()+"', '"+t.getDestination().getId()+"', '"+t.getPrice()+"')");
		    
		    Statement state2 = connection.createStatement();
		    ResultSet result = state2.executeQuery("SELECT id FROM trips ORDER BY id DESC");
		    
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
	public Trip findTripById(Long id) {
		JdbcPlaceDao jpd = new JdbcPlaceDao();
		
		Place departure = null;
		Place destination = null;
		
		long idDeparture = 0;
		long idDestination = 0;
		Double price = 0.0;
		
		try {				
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			Statement state = connection.createStatement();
		    ResultSet result = state.executeQuery("SELECT * FROM trips WHERE id='"+id+"'");
		    
		    if(result.next()){ 
		    	idDeparture = result.getInt(2);
        		idDestination = result.getInt(3);
        		price = result.getDouble(4);
		    }	
		    
		    departure = jpd.findPlaceById(idDeparture);
		    destination = jpd.findPlaceById(idDestination);
		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
		
		return new Trip(id, departure, destination, price);
	}

	@Override
	public void removeTrip(Long id) {
		try {			
			//Connection to Database
			Connection connection = ConnectionManager.getConnection();
			connection.setAutoCommit(false);
			
			//Statement
			Statement state = connection.createStatement();
			state.executeUpdate("DELETE FROM trips WHERE id='"+ id +"'");
		    
		    findTripById(id);
		    
		} catch (SQLException e) {
			System.out.println("Error found " + e);
			e.printStackTrace();
		}
	}

}
