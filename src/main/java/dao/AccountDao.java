package dao;


import exception.OverdraftException;
import model.AccountPojo;

public interface AccountDao {
	
	
	
	AccountPojo WithdrawFromAccount(AccountPojo accountPojo); 
	
	AccountPojo DepositToAccount(AccountPojo accountPojo); 
	
	AccountPojo AccountNumber(AccountPojo accountPojo);
	
	AccountPojo AccountBalance(AccountPojo accountPojo);
}
