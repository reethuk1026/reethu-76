package com.javaproject;

public class Customer {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
//		super.finalize();
		System.out.println("finalize method called"); // removes unused objects in heap memory
	}


	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		Customer c1 = new Customer();
		
//com.javaproject.Customer@27716f4-->Hexa-Decimal value of an object

		System.out.println(c1);//27716f4-->Address of the Object
		
		Customer c2 = new Customer();
		System.out.println(c2);//8efb846

		Customer c3 = new Customer();
		System.out.println(c3);//2a84aee7

		//nullifying the Objects
		c1 = null;
		c2 = null;
		
		System.gc(); //calls the finalize method (gc function)
		
		
//		int i = 0x27716f4;
//		
//		System.out.println(i);//41359092 --> Hash code
//		System.out.println(c1.hashCode());
		
	}

}


