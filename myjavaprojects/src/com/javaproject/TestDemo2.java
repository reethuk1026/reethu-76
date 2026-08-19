package com.javaproject;

//Methods Info

public class TestDemo2 {

//	instance method
	void hello() {

		System.out.println("Welcome to Java World");
	}

//	static method
	static void welcome() {
		System.out.println("ABCD");
	}

//static main method

	public static void main(String[] args) {

		System.out.println("Main method started");

//	calling the method by using object reference variable
		TestDemo2 t = new TestDemo2();

		t.hello();

//	calling the method directly (static)

		welcome();

		System.out.println("main method ended");

	}

}
