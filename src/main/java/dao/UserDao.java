package dao;


import exception.SystemException;
import model.AccountPojo;
import model.UserPojo;

public interface UserDao {
	
	UserPojo addUser(UserPojo userPojo, AccountPojo accountPojo) throws SystemException;
	
	UserPojo loginUser(UserPojo userPojo) throws SystemException;
	

}

