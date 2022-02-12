package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("347366174", 10000);
		//BankAccount acc2 = new BankAccount("943339224", 5000);
		//BankAccount acc3 = new BankAccount("890279414", 3000);
		
		acc1.setName("Tony Stark");
		System.out.println("Name: "+ acc1.getName());
		acc1.payBills(1000);
		acc1.payBills(2000);
		acc1.makeDeposit(5000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	
	private static int ID = 1000; // Internal Id. Static is used to increment it, else it will always revert to 1000
	private String accountNumber;
	private String name;
	private static String routingNumber = "0034689";
	private static String SSN;
	private double balance;
	
	//Constructor
	public BankAccount (String SSN, double initDeposit){		
		this.SSN = SSN;
		balance = initDeposit;
		ID++;	
		//System.out.println(ID);
		System.out.println ("Initial Balance:" + balance );
		setAccountNumber();			
	}

	
	private void setAccountNumber() {
		
		int random = (int) (Math.random()*100);
		accountNumber = ID +""+ random + SSN.substring(0, 2);
		System.out.println("Your Account Number: "+ accountNumber );
	}
	
	public void payBills(double amount) {
		balance = balance - amount;
		System.out.println(" Transaction Details : Pay Bills of $"+amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println(" Transaction Details : Made Deposit of $"+amount);
		showBalance();
	}
		
	
	private void showBalance() {		
		System.out.println("Current Balance: $"+ balance);
	}

	@Override
	public void accrue() {
		balance= balance *( 1 + rate/100);
		showBalance();
	}

	//Getter & Setter Method
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "[Name: "+ name + ". Account Number: " + accountNumber + ". Routing Number: " + routingNumber + ". Balance :"+ balance + "]";
	}
	
	
}