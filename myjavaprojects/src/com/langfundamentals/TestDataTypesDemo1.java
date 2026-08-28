package com.langfundamentals;

//Primitive data types

//Note: the default values provided by JVM is
//For byte, short, int, long --> 0
//for float & double --> 0.0
//for char --> (empty space)
//for boolean it is -->false

// byte -->short-->int-->long-->double --this process is known as Implicit Type Casting
//byte <--short<--int<--long<--double --if Implicit process goes reverse then is known as Explicit Type Casting

//NOte: by default Numeric RHS values are int type
//Type Casting: converting one data type value to another data type
public class TestDataTypesDemo1 {  //class level
// the byte min-max is -128 to 127
	
	byte b = 127; //declaration
//	byte b1 = 128; CE: Type mismatch: cannot convert from int to byte
	
	//-128, -127,-126.....0,1,2,3....126, 127	

	byte b1 = (byte) 130;//Explicit type casting (int to byte type casting)
	
	short s = b1; //Implicit Type Casting(COnverting byte to short)
//Short ==2 bytes = 16 bits ==2^15 =32768	
	short s1 = 32767;
//	short s2 = 32768; //type mismatch: cannot convert from int to short	

	short s2 = (short) 32768;
//int ==4bytes==32bits==2^31==2147483647
//range is -2147483648 to 2147483647
	
	int i = 2147483647;
//	int i1 = 2147483648; //The literal 2147483648 of type int is out of range 
	
//	int i1 = 2147483648L; //Type mismatch: cannot convert from long to int
	
	int i1 = (int) 2147483648L;
	
//long==8 bytes=64bits=2^63=	
	long l = 2147483648L;
	long l1 = 9223372036854775807L;
	long l2 = -9223372036854775808L;
//By default RHS decimal points are double values, so we must specify F or f for floating value
//float ==4btes=32 bits	
	float f = 5.1F;
	float f1 = 485359785125645.485359785125645F;//prints only 5 to 6 values after decimal point
//double==8 bytes=64 bits
	double d = 53.65689;
    double d1 = 48535978512564555.4853597851256455484; //prints 10-15 values after decimal point
//char ==2bytes==16bits== 32768 + 32767 = 65535	
	char c = 'R';
	char c1 = 'S';
//Implicit type casting	
	char c2 = 65; //ASCII codes -->65 to 90 == A to Z
	char c3 = 97; //ASCII codes -->97 to 122 ==a to z
	char c4 = '\u0040'; //Unicode values (o to 9 and a to f)[used for encryption/decryption]
	char c5 = '\uabcd';
	
	int i2 = 'M';
	
	float f2 = 'R';
	
	double d2 = 'S';
	
	boolean boo = true;
	
//Type mismatch: cannot convert from String to boolean	
//	boolean boo1 = "false";
//	boolean boo2 = "true";

//Type mismatch: cannot convert from int to boolean	
//  boolean boo3 = 0;
//	boolean boo4 = 1;
	
//True cannot be resolved to a variable
//	boolean boo5 = True;
//	boolean boo6 = False;
//  boolean boo7 = FALSE;
//	boolean boo8 = TRUE;



	public static void main(String[] args) {

		System.out.println("Main method started");
		
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();
		
		System.out.println("byte value : " + t1.b);
		System.out.println("short value :" + t1.s);
		System.out.println("byte value :" + t1.b1);
		System.out.println("short value :" + t1.s1);
		System.out.println("short value :" + t1.s2);

		System.out.println("int value :" + t1.i);
		System.out.println("int value :" + t1.i1);

		System.out.println("long value :" + t1.l);
		System.out.println("long value :" + t1.l1);
		System.out.println("long value :" + t1.l2);

		System.out.println("byte value :" + t1.b);


		System.out.println("float value : "+ t1.f);
		System.out.println("float value : "+ t1.f1);
		System.out.println("float value : "+ t1.f2);


		System.out.println("double value : "+ t1.d);
		System.out.println("double value : "+ t1.d1);
		System.out.println("double value : "+ t1.d2);


		System.out.println("char value : "+ t1.c);
		System.out.println("char value : "+ t1.c1);
		System.out.println("char value : "+ t1.c2);
		System.out.println("char value : "+ t1.c3);
		System.out.println("char value : "+ t1.c4);
		System.out.println("char value : "+ t1.c5);
		
		System.out.println("int value :" + t1.i2);

		System.out.println("boolean value : "+ t1.boo);
		
		
		if (t1.boo){
		
			System.out.println("Good Morning!!");

	}

}
	
}
