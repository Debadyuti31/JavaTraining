package basics;

//Execute different Methods Overloading
public class NumberCalc {
	
	public static void main (String args[]) {
		System.out.println("Program is starting...");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		//multipleNumbers(numA, numB);
		int product = multipleNumbers(numA, numB);
		//System.out.println("The Product of numbers "+numA +" and "+ numB +" are: "+ multipleNumbers(numA, numB));
		System.out.println("The Product of Numbers "+numA +" and "+ numB +" are: "+product);
	}
	
	//Function without parameters
	static void printName() {
		System.out.println("My Name is Debadyuti");
	}
	
	//Function with parameters without return type
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of the numbers "+ numberA +" and "+ numberB +" are: "+ sum);
	}
	
	//Function with parameters with return type
	static int multipleNumbers(int valA, int valB) {
		int product = valA*valB;
		//System.out.println("The multiple of the numbers "+ valA +" and "+ valB +" are: "+ product);
		
		//Function inside function
		addNumbers(product,product);
		return product;
		
	}

}
