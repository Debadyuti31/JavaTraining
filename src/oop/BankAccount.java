package oop;

public class BankAccount implements IRate{
	
	
	//Define variables
	String accountNumber;
	
	//static variable [Final = constant]
	private static final String routingNumber = "013544"; // Static belong to the class and not the object instance
	
	//instance variable
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	// Getters and Setters = Allow user to define the name and ssn	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Mr." + name;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	//Constructor definition : Unique methods
	 /* 1. They are used to define / setup / initialize properties of an object
	  * 2. They are called IMPLICITLY upon instantiation
	  * 3. Same name as that of the class itself
	  * 4. NO RETURN TYPE
	  */
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");  //Default constructor
	}
	
	
	//Overloading : same method name with different arguments
	BankAccount(String accountType){
		System.out.println("Overloading Constructor Calling.. with one argument.");
		System.out.println("New Account : "+ accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("Overloading Constructor Calling.. with two argument.");
		System.out.println("New Account : "+ accountType);
		System.out.println("Initial Deposit : "+ initDeposit);
		
		String msg = "";                                     //local variable
		if (initDeposit < 1000) {
			msg = "ERROR : Initial deposit must be atleast $1000 ";
		}
		else {
			msg = "Thanks for the initial deposit of $"+ initDeposit;
		}
		
		System.out.println(msg);
		balance = balance + initDeposit;
	}
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAWAL");
	}
	
	//Private : It can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: "+ activity);
		System.out.println("YOUR NEW BALANCE is : $" + balance);
		
	}


	void checkBalance() {
		
	}
	
	void getStatus() {
		System.out.println("Balance is "+ balance);
	
	}
	
	@Override
	public String toString() {
		return "[Name: "+ name + ". Account Number: " + accountNumber + ". Routing Number: " + routingNumber + ". Balance :"+ balance + "]";
	}
	
	//Interface Methods
	@Override
	public void setRate() {
		System.out.println("Setting Rate");
		
	}
	@Override
	public void increaseRate() {
		System.out.println("Increasing Rate");
		
	}


}
