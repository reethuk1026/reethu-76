package com.langfundamentals.constructors;
//In any Java class, if no constructors are available then only Java Compiler creates a default Constructor
//Q)If Java compiler is already providing the default constructors then why we need no-arg constructors
//Ans1: To initialize the default data instead of JVM initializing it, we need to create & intialize the no-arg constructor

//Ans-2: Because, if the class contains any parameterized constructors then Java Compiler will not provide any default constructors
//In such cases. if we want to create normal Object with out passing any values we must need to create no-arg constructor
public class Student {
//Instance data	
	int sid;
	String sname;
    String city = "Hyderabad";
    
//No-arg Constructor	
	Student(){
		System.out.println("No-arg constructor called");
		sid =101;
		sname = "unknown";
	}
//Parameterized constructor	
	Student(int sid, String sname){
		
		this.sid = sid;
		this.sname = sname;
	}
	

	public static void main(String[] args) {

		System.out.println("Main Method started");
//The below object is created with the help of default constructor (No constructors from class)
//The below object is created with the help of no-arg constructor(When we have a constructor in a class)
		
		Student s1 = new Student();
		s1.studentInfo();
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.city);

		Student s2 = new Student();
		s2.studentInfo();
//		System.out.println(s2.sid);
//		System.out.println(s2.sname);
//		System.out.println(s2.city);
 
		Student s3 = new Student(10, "Reethu");
		s3.studentInfo();
//		System.out.println(s3.sid);
//		System.out.println(s3.sname);
//		System.out.println(s3.city);

		
		System.out.println("Main Method ended");

		
		
	}

	void studentInfo() {
		System.out.println("*************************");
		System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + sname);
		System.out.println("Student City: " + city);

	}
}
