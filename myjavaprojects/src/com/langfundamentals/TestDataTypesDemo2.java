package com.langfundamentals;

import java.math.BigInteger; // we can use import java.math.*; instead of typing but for better readability should use complete package name
import java.math.BigDecimal;
import java.util.Arrays;

class Dog{
	
	String name = "Puppy";
	
	
}
public class TestDataTypesDemo2 {
//All objects data type have default value of null
	
//Object data types	
	
//	BigInteger bi = 10; //Type mismatch: cannot convert from int to BigInteger

	//To initialize Object and its instance data we need constructor

	BigInteger bi = new BigInteger("10"); //initializing object with constructor
	BigInteger bi1 = new BigInteger("264984154894894");
//	BigDecimal bd = 55.5; //Type mismatch: cannot convert from double to BigDecimal
	
	BigDecimal bd = new BigDecimal(10); //int
	BigDecimal bd1 = new BigDecimal(521545215415.54548554848481244); //double
	BigDecimal bd2 = new BigDecimal(105L); //long
	BigDecimal bd3 = new BigDecimal("100"); //String
	BigDecimal bd4 = new BigDecimal(54894215654984.54897889689); //

	
	
	String s = new String();
	//String is a class from java.lang package
	//String is working based index
	//The collection of character stored inside double quotes is called string	
	String s2 = "Shreya";  //String Literals -->SCP(String Constant Pool) --stored in Heap Area
	
	String s3 = new String("Java is Simple");

//Arrays	
	
	Arrays a;
	
//Wrapper object data types	8
//Auto-Boxing 1.5v: converting primitive data types to wrapper data types 
	Integer i = 100;// Internally it is Integer i = Integer.valueOf(100);
	Short s1 = 3554;
	Character c = 'S';
	Double dob = 52.2;
	
//Auto Unboxing: Converting wrapper object data types to primitive data types
//The constructor Integer(int) is deprecated since version 9	
	Integer i1 = new Integer(100);
	int i2 = i1; //internally int i2 = i1.intValue() --Converting Wrapper -->primitive
	
//Wrapper Caching: range is -128 to 127 values will store it in same address of the object
//if the values are crossing max value of 127 then it creates a new object every time
	
	Integer i3 = 100;
	Integer i4 = 100;
	
	Integer i5 = 200;
	Integer i6 = 200;


//User-defined data types
	
	Dog d = new Dog();
	

	public static void main(String[] args) {
    
		System.out.println("main method started");
		
		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		
		System.out.println(t.i3 == t.i4); //true
		System.out.println(t.i5 == t.i6); //false

		
		System.out.println(t.bd);//
		System.out.println(t.bd1);//
		System.out.println(t.bd2);//
		System.out.println(t.bd3);
		System.out.println(t.bd4);
		System.out.println(t.bi); //
		System.out.println(t.bi1); //

	//	System.out.println(t.bi + t.bi1); //The operator + is undefined for the argument type(s) java.math.BigInteger, java.math.BigInteger
		
		System.out.println(t.bi.add(t.bi1)); //add method
		System.out.println(t.bi.multiply(t.bi1));
		
		System.out.println(t.bd1.add(t.bd4));
		System.out.println(t.bd1.multiply(t.bd4));

		
		System.out.println(t.s); //
		System.out.println(t.s2); //
		System.out.println(t.s3); //

		System.out.println(t.a); //
		
		System.out.println(t.i); //
		System.out.println(t.s1); //
		System.out.println(t.c); // 
		System.out.println(t.dob); //
		
		System.out.println(t.d); //null

		
		
	}

}
