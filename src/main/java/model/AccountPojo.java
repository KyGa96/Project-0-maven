package model;

public class AccountPojo {
	private int accountNumber;
	private Double accountBalance;
	
	
	public AccountPojo() { //default constructor
		super();
	}

	public AccountPojo(int accountNumber, String accountName, Double accountBalance) { //Parameterized constructor
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	@Override
	public String toString() { //toString Method -- gives a string representation of the object -- when an accountPojo object is created, it will call the toString method and print the information below -- ties all variables together for debugging
		return "AccountPojo [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
	
	

}

//General format of pojo
//---------------------
//Private Variables
//default constructor
//Parameterized constructor
//Public getters/setters
//toString method
//equals -- if required
//hashCode -- if required -- (random number assigned to objects in the heap)

//Purpose is to hold data (info of 1 account)