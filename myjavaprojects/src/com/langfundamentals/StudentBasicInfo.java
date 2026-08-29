package com.langfundamentals;
//with return type + no parameters
public class StudentBasicInfo {
	

	 void main(String[] args) {

		System.out.println("main method started");
		
		String fname = getFirstName();
		String lname = getLastName();
		
	System.out.println("Full Name: " + fname +" " +lname);
		
		System.out.println("main method ended");

		
	}
	
	String getFirstName(){
		
		return "Shreya";
		
	}
	
	String getLastName(){
		
		return "Reethu";
	
	}

}
