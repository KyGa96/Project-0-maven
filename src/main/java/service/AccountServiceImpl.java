package service;


import dao.AccountDao;

import dao.AccountDaoImpl;
import exception.SystemException;
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
	public AccountPojo withdrawFromAccount(AccountPojo accountPojo) throws SystemException {
		
		return accountDao.withdrawFromAccount(accountPojo);
	}

	@Override
	public AccountPojo depositToAccount(AccountPojo accountPojo) throws SystemException {
		
		return accountDao.depositToAccount(accountPojo);
	}



}
	
