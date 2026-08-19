package com.javaproject;

//Note: JVM provides default values for static and instance data
//Static date will not change from Object to Object 
//where static data is sharable and for all Objects its creating only one copy
//Instance data will be changing from Object to Object 
//its creating new copy for every Object

//Note: Whenever the data is same for all the objects then we go for static variables
//All static related data is storing into Method Area
//Note: Whenever the data is changing from Object to Object we use instance variables
//All instance related data is storing into Heap Area
public class Cricketer {

	// Declaration
	// static variables
	static int countryId;
	static String countryName;

//non-static or instance data
	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println("Welcome to Indian Cricket Team Info");

		countryId = 91;
		countryName = "India";
		
		System.out.println("****Object1 Info*******");

		// Accessing the static data directly
		System.out.println("Country ID: " + countryId); // 0 -->91
		System.out.println("Country Name: " + countryName); // null-->India

		// Accessing the instance data
		// In static area, we cannot access instance data directly
		// If we want to access instance data in static area,
		// we must need to create "Object"
		// Cannot make a static reference to the non-static field jerseyNo
//		System.out.println(jerseyNo);
//		System.out.println(cricketerName);

		// creating an object
		// LHS: class name +reference variable name
		// RHS: new is the keyword in java to create object
		// Cricketer()--> constructor calling

		Cricketer rohit = new Cricketer();
		// Accessing the instance data by using Object Reference

		rohit.jerseyNo = 45;
		rohit.cricketerName = "Rohit Sharma";

		System.out.println("Jersey No: " + rohit.jerseyNo); // 0-->45
		System.out.println("Cricketer Name: " + rohit.cricketerName);// null-->Rohit Sharma
		System.out.println("**********");

		System.out.println("****Object2 Info*******");
		Cricketer MSD = new Cricketer();
		MSD.jerseyNo = 7;
		MSD.cricketerName = "Mahendra Singh Dhoni";
		System.out.println("Country ID: " + countryId); //
		System.out.println("Country Name: " + countryName);
		
		System.out.println("Jersey No: " + MSD.jerseyNo);
		System.out.println("Cricketer Name: " + MSD.cricketerName);
		System.out.println("**********");

		System.out.println("****Object3 Info*******");
		Cricketer vk = new Cricketer();
		vk.jerseyNo = 18;
		vk.cricketerName = "Virat Kohli";
		System.out.println("Country ID: " + countryId); //
		System.out.println("Country Name: " + countryName);
		
		System.out.println("Jersey No: " + vk.jerseyNo);
		System.out.println("Cricketer Name: " + vk.cricketerName);
		System.out.println("**********");

		System.out.println("****Object4 Info*******");

		Cricketer HK = new Cricketer();
		countryId = 92;
		countryName = "Bharat";
		HK.jerseyNo = 23;
		HK.cricketerName= "Harmanpreet Kaur";
		System.out.println("Country ID: " + countryId); //
		System.out.println("Country Name: " + countryName);
		
		System.out.println("Jersey No: " + HK.jerseyNo);
		System.out.println("Cricketer Name: " + HK.cricketerName);
		System.out.println("**********");

		System.out.println("****Object5 Info*******");

		Cricketer SM = new Cricketer();
		countryId = 92;
		countryName = "Bharat";
		SM.jerseyNo = 18;
		SM.cricketerName= "Smriti Mandhana";
		System.out.println("Country ID: " + countryId); //
		System.out.println("Country Name: " + countryName);
		
		System.out.println("Jersey No: " + SM.jerseyNo);
		System.out.println("Cricketer Name: " + SM.cricketerName);
		System.out.println("**********");


		
	}

}

