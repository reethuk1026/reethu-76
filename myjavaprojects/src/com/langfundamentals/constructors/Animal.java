package com.langfundamentals.constructors;

public class Animal extends Object {
	
	Animal(){
//		super();
		System.out.println("Animal Contructor called ");
	}

	public static void main(String[] args) {

		System.out.println("Main method started from Animal");
		
		
	}

}

class Dog extends Animal {
	
	Dog(){
//		super();//implicitly calls parent class
		System.out.println("Dog contructor called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method started from Dog");
		
		Dog d = new Dog();
		
		System.out.println("Main method ended from Dog");


	}
}