package dao;


import exception.InvalidLogin;
import exception.SystemException;
import model.AccountPojo;
import model.UserPojo;

public interface UserDao {
	
	UserPojo addUser(UserPojo userPojo) throws SystemException;
	
	UserPojo loginUser(UserPojo userPojo) throws SystemException;
	

}

