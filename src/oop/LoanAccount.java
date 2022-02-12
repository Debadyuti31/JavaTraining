package oop;

public class LoanAccount implements IRate {

	public static void main(String[] args) {

		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();

	}

	@Override
	public void setRate() {
		System.out.println("Rate");
	}
	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerms (int term) {
		System.out.println("Setting the term to "+ term + "years ");
	}
	
	
	

}
