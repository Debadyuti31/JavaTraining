package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setTerms(10);
		
		//Polymorphism changes where we are pointing
		IRate ir = new LoanAccount();
		ir.increaseRate();  // We will only see the interface methods and not the LoanAccount methods
		ir.setRate(); 		// But it calls the statement from the LoanAccount Method

	}

}
