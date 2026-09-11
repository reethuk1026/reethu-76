package com.langfundamentals.constructors;

public class Employee {
	
	int eid;
	String ename;
	double esal;
//no-arg constructor
	Employee(){
		System.out.println("no-arg constructor called!!");
		eid = 100;
		ename = "Reethu";
		esal = 10000;		
		
	}
	
//parameterized constructor
//To provide ambiguity and to provide better readability we should use exact names in constructors
//If we use exact names, we must 'this' keyword to invoke current class object data members.	
	Employee(int eid, String ename, double esal){
		System.out.println("Parameterized constructor called");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		
	}
	

	public static void main(String[] args) {

		System.out.println("Main method started");
		System.out.println("Employee Information");
		
		Employee e1 = new Employee();
		e1.show();
//		System.out.println(e1.eid);
//		System.out.println(e1.ename);
//		System.out.println(e1.esal);

		Employee e2 = new Employee(101, "Shreya", 20000.00);
		e2.show();
//		System.out.println(e2.eid);
//		System.out.println(e2.ename);
//		System.out.println(e2.esal);

		Employee e3 = new Employee();
		e3.show();
		
		Employee e4 = new Employee(102, "Madhu", 25000.00);
		e4.show();
				
		System.out.println("Main method ended");

	}
	
	void show(){
		System.out.println("**************************");
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee salary: " + esal);
		
	}
	
}
