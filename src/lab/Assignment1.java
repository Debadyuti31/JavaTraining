package lab;

public class Assignment1 {

	public static void main(String[] args) {
		
		int x = 3 ;
		int n = 4;
		
		//Function that takes a value n returns the sum of numbers 1 to n
		sum(x);
		
		//Function that computes the factorial value		
		System.out.println("The factorial of "+ n +" is : "+ fact(n));
		
		//Functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		
		//int arr[] = new int[5];
		int arr[]= {1,2,3,4,5};
		
		System.out.println("The Minimum value of the array is : " + min(arr) );
		System.out.println("The Maximum value of the array is : " + max(arr) );
		System.out.println("The Average value of the array is : " + avg(arr) );
	}
	
	
	//Function that takes a value n returns the sum of numbers 1 to n
	public static void sum(int n) {
		System.out.println("Function that takes a value n returns the sum of numbers 1 to n ");
		int sum=0;
		for (int i=1;i<=n;i++) { 
			sum = sum+i;
			
		}
		System.out.println("The Sum of "+ sum); 
	}
		
	/*
	 * Definition: n! = n*(n-1)! , where 0! = 1 
	 * 1! = 1 
	 * 2! = 2 * 1! = 2 * 1 
	 * 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1 
	 * 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	 */
	//Factorial function
	public static int fact(int n) {
		/*if(n==0) {
			return 1;
		}
		else if (n==1) {
			return 1;
		}*/
		if((n==0) || (n==1)) {
			return 1;
		}
		else 
			return (fact(n-1)* n);
	}

	//Functions that take an array as a parameter and return the minimum of the array
	public static int min(int arr[]) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
				
			if (arr[i] < min) {
					min = arr[i];
			}
		}
		return min;
	}

		
	//Functions that take an array as a parameter and return the maximum of the array
	public static int max(int arr[]) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	
	//Functions that take an array as a parameter and return the average of the array
	public static double avg(int arr[]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
		}
		double avg = sum/arr.length;
		return avg;
	}
}
