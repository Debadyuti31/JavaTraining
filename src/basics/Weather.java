package basics;

//Execute IF-ELSE Block
public class Weather {
	
	public static void main (String args[]) {
		
		//What to wear based on temperature
		
		int temperature=65;
		String sunCondition = "OverCast";
		
		if (temperature>80) {
			System.out.println("Its Hot , Wear light clothes");
		}
		else if ((temperature>60) && (sunCondition == "Sunny")) {
			System.out.println("Its little cold , wear jeans and full sleeves");
		}
		else if ((temperature>50) && (sunCondition == "OverCast")) {
			System.out.println("Its a cool day , wear something warmer");
		}
		else {
			System.out.println("Looks like a cold day, bring sweater");
		}
		
		System.out.println("The End");
		  
	}

}
