package service;

import model.AccountPojo;

public interface AccountService {
	
	

	

	AccountPojo withdrawFromAccount(AccountPojo accountPojo, double withdrawFunds);
	
	AccountPojo depositToAccount(AccountPojo accountPojo, double depostitFunds);
	
	AccountPojo viewAccountBalance(AccountPojo accountPojo, double ViewAccountBalance);
	
	
}
