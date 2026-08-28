package com.langfundamentals;

//Note: Generally, java is a case sensitive programming language but not for the literals
public class TestLiteralsDemo1 {

	public static void main(String[] args) {
//below 3 variables are Decimal Literals (base is 10)
//Decimal==base is 10-->0 to 9		
		int a = 10;
		int a1 = 124;
		int a2 = 567;
		
//below variable is octal literal
//octal = base is 8---> 0 to 7	
//octal literals starts with 0.
//0 + 1*8^2 +3*8^1 +3*8^0 = 64+16+3 = 83 (right to left)		
		int a3 = 0123;
 
		int a4 = 0456;
		int a5 = 0776;
		int a6 = 04761;
		int a7 = 0657;

//The below values are Hexa-Decimal Literals.
//HexaDecimal ==base is 16-->0 to 9 and a to f/A to F--> a= 10, b=11, c=12, d =13, e=14, f=15
		
//right to left (0*16^3+ 1*16^2 +2*16^1 +3*16^0 = 256+32+3 = 291)		
		
		int a8 = 0x123;
		int a9 = 0xabc;
		
		int a10 = 0x1a2b;
		int a11 = 0xbee;
		int a12 = 0xDad;
//		int a13 = 0xbeer; //not in range a to f

//blow values are binary literals		
//Binary literals ==base is 2 --> 0 &1
//Binary Literals starts with 0b or OB		
		int a13 = 0b1010; //16 8 4 2 1
		int a14 = 0b1110;
		int a15 = 0B0101;
		
		
		System.out.println(a); //10
		System.out.println(a1);//124
		System.out.println(a2);//567
		System.out.println(a3);//83
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);

		
	}

}
