package lab;

public class FibonacciApp {

	public static void main(String[] args) {
		//Fibonacci series is defined by the sum of two previous numbers
		//fib(0)= 0
		//fib(1)= 1
		//fib(2)= fib(1) + fib(0); 0 + 1 = 1
		//fib(3)= fib(2) + fib(1); 1 + 1 = 2
		//fib(4)= fib(3) + fib(2); 2 + 1 = 3
		//fib(5)= fib(4) + fib(3); 3 + 2 = 5
		
		System.out.println(fib(4));
		
		/*
		 * for (int i=0;i<=10;i++) { 
		 * 	System.out.println(fib(i)); 
		 * }
		 */
		
	}
	
	//Recursive function
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else 
			return (fib(n-1)+fib(n-2));
	}




}
