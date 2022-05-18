package exception;

public class InvalidLogin extends Exception{
	
	@Override
	public String getMessage() {
		return "Invalid username and/or password, please create an account or try again";
	}

}
