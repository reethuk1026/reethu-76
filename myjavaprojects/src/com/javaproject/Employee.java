package com.javaproject;

public class Employee {
	
	int eid;
	String ename;

	static int orgID = 555;
    static String orgName = "Vcube"; // we can initialize static data


	public static void main(String[] args) {
		
		int orgID = 666;
		String orgName ="VSS"; //priority will be given to local variables instead of static variables
		

//JVM will not provide default values for Local Variables, we must initialize to access local variable
		
//		int a;
//		System.out.println(a);//we will get compile time error if we do not initialize local variable
		
		
		int age = 25;
		System.out.println(age);
		
		Employee sr = new Employee();
		//can access the static data directly
		System.out.println(orgID);
		System.out.println(orgName);
		
//can access the static data by using class name --- 
//---if we want to access the static variable over local variables then we must access it with class name
		System.out.println(Employee.orgID);
		System.out.println(Employee.orgName);
		
//can access the static data by using object reference variable
//we cannot access the local variables with object reference 	
//		System.out.println(sr.orgID);
//		System.out.println(sr.orgName);
		System.out.println("_------------------------");
		
 //instance data can be accessed by using only object reference variable 
		System.out.println(sr.eid);
		System.out.println(sr.ename);

		
		
	
		
	}

}
