package com.langfundamentals.constructors;

public class Flower {
	
        String name = "Jasmine";
        String color = "white";
	
	public static void main(String[] args) {

		System.out.println("Main method started from Flower");

		
	}
	
}

class Rose extends Flower{
	
    String name = "Rose";
    String color = "Red";

	
	public static void main(String[] args) {
		System.out.println("Main method started from Rose class");
		
		Rose r = new Rose();
		r.roseInfo();
//Cannot use super in a static context		
//		System.out.println("Name of the Flower: " + super.name);
//		System.out.println("Name of the Flower: " + this.name);
		
		System.out.println("Main method ended from Rose class");

	}
// instance method	
	void roseInfo() {
		System.out.println("Child class data: ");
		System.out.println("Name of the Flower: " + this.name);//to invoke child class object
		System.out.println("Color of the Flower: " + this.color );
		
		System.out.println("Parent class data: ");
		System.out.println("Name of the Flower: " + super.name); //to invoke parent class object
		System.out.println("Color of the Flower: " + super.color );

	}
	
	
}