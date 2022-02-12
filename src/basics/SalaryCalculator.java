package basics;

//Variables
public class SalaryCalculator {
	public static void main (String args[]) {
		
		//Declare a variable
		System.out.println("...Start...");
		
		String career;
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career : "+ career);
		
		//Declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.5;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		career ="Web Developer";
		System.out.println("My Salary as a "+ career + " at the rate of $"+ rate +" per hour is $"+salary+" per year");
		
	}
	

}
