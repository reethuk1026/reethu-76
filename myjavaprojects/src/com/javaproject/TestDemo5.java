package com.javaproject;

public class TestDemo5 {
	
	
	native void welcome();
	
	
	void hello() {
		
		System.out.println(Thread.currentThread());

		
		int a = 10;
		int b = 20;
		
		
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("Welcome");
		System.out.println(a + b);

	}
	

	public static void main(String[] args) {
		
	     System.out.println("Java Program");


		TestDemo5 t = new TestDemo5();	
		t.hello();
		
		
	     System.out.println("Java World");
		System.out.println(Thread.currentThread()); //thread function
		
		
	}

}
