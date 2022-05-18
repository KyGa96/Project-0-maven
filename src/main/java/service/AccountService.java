package service;


import exception.OverdraftException;
import model.AccountPojo;

public interface AccountService {
	
	

	

	AccountPojo WithdrawFromAccount(AccountPojo accountPojo, double withdrawFunds) throws OverdraftException;
	
	AccountPojo DepositToAccount(AccountPojo accountPojo, double depostitFunds);
	
	AccountPojo AccountNumber(AccountPojo accountPojo);
	
	AccountPojo AccountBalance(AccountPojo accountPojo);


}
