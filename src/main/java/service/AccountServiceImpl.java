package service;


import dao.AccountDao;
import dao.AccountDaoImpl;
import exception.OverdraftException;
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
	public AccountPojo WithdrawFromAccount(AccountPojo accountPojo, double withdrawFunds) throws OverdraftException {
		
		return accountDao.WithdrawFromAccount(accountPojo);
	}

	@Override
	public AccountPojo DepositToAccount(AccountPojo accountPojo, double depostitFunds) {
		
		return accountDao.DepositToAccount(accountPojo);
	}

	@Override
	public AccountPojo AccountNumber(AccountPojo accountPojo) {
		
		return accountDao.AccountNumber(accountPojo);
	}

	@Override
	public AccountPojo AccountBalance(AccountPojo accountPojo) {
		
		return accountDao.AccountBalance(accountPojo);
	}
	
	
	}
	

