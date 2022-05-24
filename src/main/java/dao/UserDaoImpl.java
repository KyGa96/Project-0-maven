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
	public UserPojo addUser(UserPojo userPojo, AccountPojo accountPojo) throws SystemException { 
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			
			String query1 = "INSERT INTO userinfo(username, password) VALUES ('" + userPojo.getUsername() + "', '" + userPojo.getPassword()+ "') returning accountnumber";
			ResultSet resultSet = stmt.executeQuery(query1);
			resultSet.next();
			userPojo.setAccountNumber(resultSet.getInt(1));
			String quary2 = "INSERT INTO accountinfo(accountnumber) SELECT accountnumber FROM userinfo ORDER BY accountnumber DESC LIMIT 1 returning accountnumber";
			ResultSet resultSet2 = stmt.executeQuery(quary2);
			resultSet2.next();
			accountPojo.setAccountNumber(resultSet2.getInt(1));
			String quary3 = "UPDATE accountinfo SET accountbalance= 0 WHERE accountnumber=" + accountPojo.getAccountNumber();
			int resultSet3 = stmt.executeUpdate(quary3);
			//resultSet3.next();
			
			
		} catch (SQLException e) {
			e.printStackTrace(); 
			throw new SystemException();
		}
		
		return userPojo;
	}

	@Override
	public UserPojo loginUser(UserPojo userPojo)throws SystemException {
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM userinfo WHERE username="+"'"+userPojo.getUsername()+"'"+"and password=" +"'"+ userPojo.getPassword()+"'";
			ResultSet resultSet = stmt.executeQuery(query);
			if (resultSet.next()) {
				userPojo.setAccountNumber(resultSet.getInt(1));
			}
		
		} catch(SQLException e) {
		
	}
		return userPojo;
	
	}
}
	