package com.javaproject;

public class TestDemo4 {
	
	static TestDemo4 t4 = new TestDemo4();
	
//Static block
	static {
		System.out.println("static block called 1");
		
	}
	
//	static TestDemo4 t4 = new TestDemo4();

//instance block	
	{
		System.out.println("instance block called 1");
//		 TestDemo4 t4 = new TestDemo4(); //we will get Stack overflow error as the instance data will loop repeatedly

	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
//		TestDemo4 t4 = new TestDemo4();

		
        System.out.println("Main method ended");
        
	}
        
//    	static {
//    		System.out.println("static block called 2");
//    	}
//
//    	{
//    		System.out.println("instance block called 2");
//    	}

        
}
