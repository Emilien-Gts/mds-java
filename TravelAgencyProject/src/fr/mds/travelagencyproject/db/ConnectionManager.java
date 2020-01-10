package fr.mds.travelagencyproject.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	//CONST
	public static final String url = "jdbc:mysql://127.0.0.1/javamds?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String user = "root";
	public static final String password = ""; 
	
	//singleton
	private static Connection c = null;
	
	public static Connection getConnection() {
		if(c == null) {
			//instantiate connection
			try {
				loadDriver();
				c = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return c;
	}
			
	private static void loadDriver() {		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex){
			System.out.println("Error found " + ex);
			ex.printStackTrace();
		}
	}
}
