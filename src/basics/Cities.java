package basics;

//Arrays and Loops
public class Cities {

	public static void main(String[] args) {
		
		//Declare the array
		String[] countries;
				
		//Define the array
		countries = new String[2];
		countries[0]="USA";
		countries[1]="India";
				
		//System.out.println(countries[1]);
				
		//Declare and define Array
		String [] cities = {"New York","Chicago","Miami","Boston"}; // Implicitly define array size
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and define array (Only size)
		String[] states = new String[5]; // Explicitly define array size
		states[0]= "New York";
		states[1]= "Illinois";
		states[2]= "Florida";
		states[3]= "Texas";
		states[4]= "Utah";
		
		//LOOPS
		//DO Loop enters the loop and then tests condition
		int i=0;
		do {
			System.out.println(states[i]);
			i=i+1;
		} while (i<5);
		
		//WHILE loops tests condition and then enters the loop
		int n=0;
		boolean stateFound = false;
		//while(n<=4){
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State Found");
				stateFound = true;
			}
			n++;
			//System.out.println("State at "+ n + " : "+ states[n]);
		}
		
		System.out.println("\nPrinting with For Loop");
		//FOR Loop : Best structure for iterating through arrays
		for (int x=0;x<5;x++) {
			System.out.println(states[x]);
		}
				
	}

}
