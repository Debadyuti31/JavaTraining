package basics;

//STRINGS
public class Strings {

	public static void main(String[] args) {
		
		String bookName = "The Lord of the Rings";
		String wordChoice = "Ring";
		
		//contains
		if(bookName.contains(wordChoice)) {
			System.out.println("The Book contains the word "+ wordChoice);
		}
		
		//EqualsIgnoreCase
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The Browser is Chrome");
		}
		
		//Substring
		String firstName = "Debadyuti";
		String lastName = "Mitra";
		String SSN = "43211984";
		
		System.out.println("There are "+SSN.length()+" digits in the SSN.");
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(3));
		
	
		
		
		
	}

}
