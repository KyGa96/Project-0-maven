package service;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.InvalidLogin;
import exception.SystemException;
import model.AccountPojo;
import model.UserPojo;

public class UserServiceImpl implements UserService {
	
	UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}
	public UserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public UserPojo addUser(UserPojo userPojo) throws SystemException {
		
		return userDao.addUser(userPojo);
	}

	@Override
	public UserPojo loginUser(UserPojo userPojo) throws SystemException {

		
		return userDao.loginUser(userPojo);
	}

}
