package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



import exception.OverdraftException;
import model.AccountPojo;

public class AccountDaoImpl implements AccountDao {
	
	public AccountPojo DepositToAccount(AccountPojo accountPojo) {
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "UPDATE accountinfo SET accountbalance=" + accountPojo.getAccountBalance() + "WHERE accountbalance =" + accountPojo.getAccountBalance();
			int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return accountPojo;
	}


	@Override
	public AccountPojo WithdrawFromAccount(AccountPojo accountPojo) {
			 Connection conn = null;
			
			try {
				conn = DBUtil.makeConnection();
				Statement stmt = conn.createStatement();
				String query = "UPDATE accountinfo SET accountbalance=" + accountPojo.getAccountBalance() + "WHERE accountbalance =" + accountPojo.getAccountBalance();
				int rowsAffected = stmt.executeUpdate(query);
			}catch (SQLException e) {
				e.printStackTrace();
				
			}
			return accountPojo;
		}


	@Override
	public AccountPojo AccountNumber(AccountPojo accountPojo) {
		Connection conn = null;
		
		try {
			
		
		conn = DBUtil.makeConnection();
		Statement stmt = conn.createStatement();
		String query = "UPDATE accountinfo SET accountnumber=" + accountPojo.getAccountNumber() + "WHERE accountnumber =" + accountPojo.getAccountNumber();
		int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
		e.printStackTrace();
		}
		return accountPojo;
		
	}


	@Override
	public AccountPojo AccountBalance(AccountPojo accountPojo) {
Connection conn = null;
		
		try {
			
		
		conn = DBUtil.makeConnection();
		Statement stmt = conn.createStatement();
		String query = "UPDATE accountinfo SET accountnumber=" + accountPojo.getAccountBalance() + "WHERE accountbalance =" + accountPojo.getAccountNumber();
		int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
		e.printStackTrace();
		}
		return accountPojo;
	}
}


