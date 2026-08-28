package com.langfundamentals;

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

		
		System.out.println("main method started");
		
		String str = "";
//        String str1;  // JVM does not provide default values for local variables
		String str1 ="null";
		String str2 = "Shreya";//String Literals-->SCP:String COnstant Pool from heap-->object
		String str3 = "Shreya";//SCP--0 objects(doesn't create same object again)
		String str4 = "Shreya";
		String str5 = "Java";
		
		String str6 = new String("Vcube"); //String Object==inside Heap Memory-->its creating 2 objects 1 in Heap + 1 in SCP
		String str7 = new String("Vcube");// now it only creates in Heap memory not in SCP
		String str8 = "Vcube"; //0 objects
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
//== operator checks the addresses of the object but not the values (object data type)
//==operator checks the values only for primitive data types.		
		System.out.println(str2==str3);
		System.out.println(str6==str7);


		
//		System.out.println(str1); //The local variable str1 may not have been initialized

		System.out.println("main method ended");


	}

}
