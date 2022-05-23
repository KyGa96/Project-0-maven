package service;

import exception.SystemException;
import model.AccountPojo;

public interface AccountService {
	
	

	

	AccountPojo withdrawFromAccount(AccountPojo accountPojo) throws SystemException;
	
	AccountPojo depositToAccount(AccountPojo accountPojo)throws SystemException;
	;
	
}
