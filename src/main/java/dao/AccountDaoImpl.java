package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.AccountPojo;

public class AccountDaoImpl implements AccountDao {
	@Override
	public AccountPojo depositToAccount(AccountPojo accountPojo)throws SystemException{
		Connection conn = null;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "UPDATE accountinfo SET accountbalance=" + accountPojo.getAccountBalance() + "WHERE accountNumber=" + accountPojo.getAccountNumber();
			int rowsAffected = stmt.executeUpdate(query);
		}catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return accountPojo;
	}


	@Override
	public AccountPojo withdrawFromAccount(AccountPojo accountPojo) throws SystemException {
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
	


	
}


