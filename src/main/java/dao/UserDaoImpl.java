package dao;


import java.sql.Statement;


import exception.SystemException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.AccountPojo;
import model.UserPojo;

public class UserDaoImpl implements UserDao {
	

	@Override
	public UserPojo addUser(UserPojo userPojo) throws SystemException { 
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			
			String query1 = "INSERT INTO userinfo(username, password) VALUES ('" + userPojo.getUsername() + "', '" + userPojo.getPassword()+ "') returning accountnumber";
			ResultSet resultSet = stmt.executeQuery(query1);
			resultSet.next();
			userPojo.setAccountNumber(resultSet.getInt(1));
			String query2 = "INSERT INTO accountinfo(accountnumber) SELECT accountNumber FROM userinfo ORDER BY userinfo DESC LIMIT 1 returning accountnumber";
			ResultSet resultSet2 = stmt.executeQuery(query2);
			resultSet2.next();
		} catch (SQLException e) {
			e.printStackTrace(); 
			throw new SystemException();
		}
		
		return userPojo;
	}

	@Override
	public UserPojo loginUser(UserPojo userPojo) {
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String addRecord = "INSERT INTO userinfo(password) VALUES ('" + userPojo.getUsername() + "', '" + userPojo.getPassword()+ "') returning password";
			ResultSet resultSet = stmt.executeQuery(addRecord);
			if (resultSet.next()) {
				userPojo.setPassword(resultSet.getString(1));
			}
		
		} catch(SQLException e) {
		
	}
		return userPojo;
	
	}
}

	