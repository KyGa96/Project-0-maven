package exception;

public class OverdraftException extends Exception {
	
	@Override
	public String getMessage() {
		return "Account overdraft prohibited, request denied";
	}

}
