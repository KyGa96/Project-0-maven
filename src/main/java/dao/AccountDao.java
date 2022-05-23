package dao;




import exception.SystemException;
import model.AccountPojo;

public interface AccountDao {
	
	
	
	AccountPojo withdrawFromAccount(AccountPojo accountPojo)throws SystemException;
	
	AccountPojo depositToAccount(AccountPojo accountPojo)throws SystemException; 	
	}
