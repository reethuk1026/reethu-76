package com.langfundamentals;
//Floating Literals
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		float f1 = 123;//int -->float (implicit type casting)
		float f2 = 0123;//83.0 -->octal number ==int==float 
//		float f3 = 123.5; //compile time error:Type mismatch: cannot convert from double to float
		float f4 = 123.5F; //123.5
		float f5 = 0123.5F;//123.5//In floating point data, we dont have octal so its directly floating point data
		float f6 = 123F;//123.0
		float f7 =0123F;//123.0
		float f8 = 0x123F;//4671.0-->hexadecimal value
//		float f9 = 0x123.5F; //Invalid hex literal number
//		float f10 = 0x123.5;//Invalid hex literal number
//		float f11 = 0xabc.5F;//Invalid hex literal number
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);

	}

}
