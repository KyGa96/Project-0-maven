package service;


import dao.AccountDao;

import dao.AccountDaoImpl;
import model.AccountPojo;


public class AccountServiceImpl implements AccountService{
	
	AccountDao accountDao;
	
	public AccountServiceImpl() {
		accountDao = new AccountDaoImpl();
	}
	public AccountDao getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public AccountPojo withdrawFromAccount(AccountPojo accountPojo, double withdrawFunds) {
		
		return accountDao.withdrawFromAccount(accountPojo);
	}

	@Override
	public AccountPojo depositToAccount(AccountPojo accountPojo, double depostitFunds) {
		
		return accountDao.depositToAccount(accountPojo);
	}

	@Override
	public AccountPojo viewAccountBalance(AccountPojo accountPojo, double viewAccountBalance) {
		
		return accountDao.viewAccountBalance(accountPojo);
	}

}
	
