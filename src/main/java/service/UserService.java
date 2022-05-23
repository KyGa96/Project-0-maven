package service;



import exception.SystemException;
import model.AccountPojo;
import model.UserPojo;

public interface UserService {
	
	UserPojo addUser(UserPojo userPojo, AccountPojo accountPojo)  throws SystemException;
	
	UserPojo loginUser (UserPojo userpojo) throws SystemException;

}
