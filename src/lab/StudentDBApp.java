package lab;

public class StudentDBApp {

	public static void main(String[] args) {
		
		Student stud1= new Student ("347366174", "Tony");
		stud1.setPhone("9433392244");
		System.out.println("Phone  #: "+ stud1.getPhone());
		stud1.setCity("New York City");
		System.out.println("City : "+ stud1.getCity());
		stud1.setState("New York");
		System.out.println("State : "+ stud1.getState());
		
		stud1.enroll("Maths");
		stud1.enroll("English");
		stud1.pay(2000);
		stud1.checkBalance();
		System.out.println(stud1.toString());
		stud1.showCourses();
	
	}

}




 class Student {
		
		private static int ID = 1000 ; //Set a private static ID
		private String userID;
		private String name;
		private String emailID;
		private static String SSN;
		private String phone;
		private String city;
		private String state;
		private double balance;
		private static final int costOfCourse = 10000;
		private String course = "";
	
		
		//Constructor that takes name and SSN in the arguments
		public Student (String SSN, String name){		
			this.SSN = SSN;
			this.name = name;
			//balance = 10000;
			ID++;	
			setEmailID();
			generateUserID();
		}

		
		//Automatically create an email ID based on the name
		private void setEmailID() {
			emailID = name.toLowerCase() +""+ SSN.substring(0, 2)+""+"@sdetuniversity.com";
			System.out.println("Email ID: "+ emailID );	
		}
		
		public String getEmailID() {
			return emailID;
		}
		
		//Generate a user ID that is combination of Static ID, random 4-digit number between 1000 & 9000, and last 4 of SSN
		private void generateUserID() {
			int random = getRandomNumber();			
			userID = ID +""+ random + SSN.substring(5);
			System.out.println("User ID: "+ userID );			
		}
		
		private int getRandomNumber() {
			int max = 9000;
			int min = 1000;
		    return (int) ((Math.random() * (max - min)) + min);
		}

		
		//Encapsulation to set variables (phone, city, state)
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		//Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
		public void enroll(String course) {
			this.course= this.course +" "+ course;
			balance = balance + costOfCourse;
			System.out.println("Balance: $"+ balance +"Enrollment Done");
		}
		
		public void pay(double amount) {
			balance = balance - amount;
			System.out.println("Payment of $"+ amount+ " done.");
		}
		
		public void checkBalance() {		
			System.out.println("Current Balance: $"+ balance);
		}

		@Override
		public String toString() {
			return "Name: "+ name + ".\n"+"SSN: " + SSN + ".\n"+ "Courses: "+ course +".\n"+ "Balance :"+ balance ;
		}
		
		public void showCourses() {		
			System.out.println("All Courses");
		}
		
}
