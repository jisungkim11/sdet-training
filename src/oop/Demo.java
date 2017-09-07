package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	public static void main (String [] args){
		
		//instantiating a object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Jon";
		person1.email = "testing1@john.com";
		person1.phone = "7035090888";
		
		//Abstraction
		person1.walk(); //only accessing what is needed; not eat(); nor sleep();
		
		Person person2 = new Person();
		person2.email = "sambo@onlyemail.com";
		
		person2.eat(); //accessing only email since eat(); doesnt require any other property
		
		
		/*
		//Person
		
		//attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "1234567890";
		
		//action, activity, behavior
		System.out.println(name + "is walking");
		System.out.println(name + "is eating");
		
		//ok,, what about for another person?
		String name2 = "Joe";
		String email2 = "joe@testemail.com";
		String phone2 = "1234567890";
		
		//action, activity, behavior
		System.out.println(name2 + "is walking");
		System.out.println(name2 + "is eating");
		*/
	}
}
