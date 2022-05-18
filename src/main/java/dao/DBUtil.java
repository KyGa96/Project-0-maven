package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	static Connection conn;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			
		}catch (ClassNotFoundException e){
			
			e.printStackTrace();
		}
	}
	static Connection makeConnection() throws SQLException{
		String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "LionSalad4t56";
		if(conn == null) {
			conn = DriverManager.getConnection(connectionUrl, username, password);
		}
		return conn;
	}
}
