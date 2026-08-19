package com.javaproject;

public class User {
	
     int a = 100;
	
	void hello() {
		
		System.out.println("Hello World");
		
//		User u = new User();
		
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
     
		System.out.println("Finalization Invoked");

	}

	public static void main(String[] args) {

		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		//Nullifying the object
		u1 = null;
		
		//Re-assigning the object
		
		User u4 = new User();
		 u2 = u4;
		 
		//Anonymous Object (doesn't have reference) 
		 
		 //Objects inside the methods

		 new User().hello();
		 
		 

		
		System.gc();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
        

	}

}
