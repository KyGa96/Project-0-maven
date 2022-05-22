package model;

public class UserPojo {
	private String password;
	private String username;
	private int accountNumber;
	
	
	public UserPojo() {
		}


	public UserPojo(String password, String username, int accountNumber) {
		super();
		this.password = password;
		this.username = username;
		this.accountNumber = accountNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAccountNumer() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "UserPojo [password=" + password + ", username=" + username + ", accountNumber=" + accountNumber + "]";
	}
	
	
}