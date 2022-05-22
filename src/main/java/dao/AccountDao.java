package dao;




import model.AccountPojo;

public interface AccountDao {
	
	
	
	AccountPojo withdrawFromAccount(AccountPojo accountPojo);
	
	AccountPojo depositToAccount(AccountPojo accountPojo); 
	
	AccountPojo viewAccountBalance (AccountPojo accountPojo);
}
