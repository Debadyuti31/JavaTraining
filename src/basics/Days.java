package basics;

//Execute different blocks based on the value : SWITCH CASE
public class Days {
	
	public static void main (String args[]) {
		
		String daysOfWeek = "Tuesday";
		
		switch(daysOfWeek) {
		case "Monday" : 
			System.out.println("Today is Monday");
			break;
		case "Tuesday" : 
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday" : 
			System.out.println("Today is Wednesday");
			break;
		case "Thursday" : 
			System.out.println("Today is Thursday");
			break;
		case "Friday" : 
			System.out.println("Today is Friday");
			break;
		case "Saturday" : 
			System.out.println("Today is Saturday");
			break;
		case "Sunday" : 
			System.out.println("Today is Sunday");
			break;
		
		}
		
		
		
		System.out.println("The End");
		  
	}

}
