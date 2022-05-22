package dao;


import exception.SystemException;
import model.UserPojo;

public interface UserDao {
	
	UserPojo addUser(UserPojo userPojo) throws SystemException;
	
	UserPojo loginUser(UserPojo userPojo) throws SystemException;
	

}

