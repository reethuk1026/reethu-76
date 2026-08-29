package com.langfundamentals;

//No Return type + with parameters
//WAP to print calculate values based on your input..?
//Arithmetic Operators
//sum=+, Difference= -, Product= *, Quotient = /, Remainder = %
//98/5 -->19, 98%5 -->3
//1/10-->  0 , 1 % 10 -- > 1
public class TypesOfMethodsDemo2 {
	
	static void addition(int a, int b) { //a,b are the parameters
		
		
//String +anything is String
//BODMAS -->		
		System.out.println("Sum of two numbers:" + (a + b));
		
	}
	
	static void subtraction(float a, float b) {
		
		System.out.println("Difference of 2 numbers:" + (a -b));
	}

	static void modulus(float f1, double d2) {
		
		
		System.out.println("Remainder of two numbers: " + (d2 % f1));
		
	}
	
	
	public static void main(String[] args) {

		System.out.println("Main Method Started");

//throws error, as addition method contains parameters, so it expects arguments
		//addition();
	//call by value
		addition(10,20); //arguments 
	//call by value	
		subtraction(765, 234);
		
		modulus(9, 165);
		
		System.out.println("Main Method Ended");

	}
	
		

}
