package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}
public class Demo {

	public static void main(String[] args) {

		// Instantiating an object
		Person person1= new Person();
		
		//Define some properties (Bind attributes and methods to objects)
		person1.name = "Saurav";
		person1.email = "saurav@gmail.com";
		person1.phone = "3473661723";
		
		//Abstraction
		person1.eat();
		person1.sleep();

	}

}
