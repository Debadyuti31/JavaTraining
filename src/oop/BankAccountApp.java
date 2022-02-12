package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Tony"; // Old way of doing it, not a good practice
		//With Encapsulation
		acc1.setName("Tony");
		System.out.println("Name: "+ acc1.getName());
		acc1.setSsn("98761234");
		System.out.println("SSN: "+ acc1.getSsn());
		
		//Interface methods
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.accountNumber = "124455";
		acc1.balance = 10000;
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.withdraw(5000);
		
		//Polymorphism through OverRidding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through Constructor OverLoading
		/* BankAccount acc2 = new BankAccount("Checking Account");
		 * acc2.accountNumber = "134455";
		 * 
		 * BankAccount acc3 = new BankAccount("Savings Account", 5000);
		 * acc3.accountNumber = "144455" ; acc3.getStatus();
		 */
		
		/* System.out.println(acc1.accountNumber + " Object 1 " + acc1.routingNumber);
		 * System.out.println(acc2.accountNumber + " Object 2 " + acc2.routingNumber);
		 * System.out.println(acc3.accountNumber + " Object 3 " + acc3.routingNumber);
		 */
		
		//Demo for Inheritance	
		/* CDAccount cd1 = new CDAccount(); cd1.accountNumber = "112244"; cd1.balance =
		 * 3000; cd1.name = "Steve"; cd1.accountType = "CD Account";
		 * System.out.println(cd1.toString());
		 */
	}

}
