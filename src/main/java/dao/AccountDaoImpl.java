package dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;




import model.AccountPojo;

public class AccountDaoImpl implements AccountDao {
	
	public AccountPojo depositToAccount(AccountPojo accountPojo) {
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "UPDATE accountinfo SET accountbalance=" + accountPojo.getAccountBalance() + "WHERE accountNumber=" + accountPojo.getAccountNumber();
			int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return accountPojo;
	}


	@Override
	public AccountPojo withdrawFromAccount(AccountPojo accountPojo) {
			 Connection conn = null;
			
			try {
				conn = DBUtil.makeConnection();
				Statement stmt = conn.createStatement();
				String query = "UPDATE accountinfo SET accountbalance=" + accountPojo.getAccountBalance() + "WHERE accountNumber=" + accountPojo.getAccountNumber();
				int rowsAffected = stmt.executeUpdate(query);
			}catch (SQLException e) {
				e.printStackTrace();
				
			}
			return accountPojo;
		}


	@Override
	public AccountPojo viewAccountBalance(AccountPojo accountPojo) {
		 Connection conn = null;
		 
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM accountinfo WHERE accountbalance =" + accountPojo.getAccountBalance();
			int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return accountPojo;
	}


	
}


