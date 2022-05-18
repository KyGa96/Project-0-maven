package model;

public class UserPojo {
	private String password;
	private String username;
	private int accountNumer;
	
	
	public UserPojo() {
		}


	public UserPojo(String password, String username, int accountNumer) {
		super();
		this.password = password;
		this.username = username;
		this.accountNumer = accountNumer;
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
		return accountNumer;
	}


	public void setAccountNumber(int accountNumer) {
		this.accountNumer = accountNumer;
	}


	@Override
	public String toString() {
		return "UserPojo [password=" + password + ", username=" + username + ", accountNumer=" + accountNumer + "]";
	}
	
	
}