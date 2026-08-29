package com.langfundamentals;

public class TypesOfMethodsDemo1 {

//1) No return type + No parameters : instance & static	
	
	public static void main(String[] args) {

		System.out.println("Main Method Started");
		welcome();
		TypesOfMethodsDemo1.welcome();

		
//		display(); //instance method cannot be accessed directly, should be accessed using object reference variable
		
		TypesOfMethodsDemo1  t1  = new TypesOfMethodsDemo1();
		t1.display();
		
	}
//instance method	
	void display() {
		System.out.println("Display your ID card");
	}
//static method	
	static void welcome() {
		System.out.println("Welcome to Vcube -Java!!");
	}
	
	
}
