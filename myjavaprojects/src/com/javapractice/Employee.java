package com.javapractice;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	
	static int compID = 101;
	static String compName = "TechNova Solutions";
	

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.empId = 1111;
		emp1.empName = "Shreya";
		emp1.salary = 50000;
		
		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp1.empId);
		System.out.println("Employee Name: " + emp1.empName);
		System.out.println("Employee Salary: " + emp1.salary);
		System.out.println("*****************");
		
		Employee emp2 = new Employee();
		
		emp2.empId = 1112;
		emp2.empName = "Reethu";
		emp2.salary = 49000;
		
		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp2.empId);
		System.out.println("Employee Name: " + emp2.empName);
		System.out.println("Employee Salary: " + emp2.salary);
		System.out.println("*****************");

		
		
	
		Employee emp3 = new Employee();
		
		compID = 107;
		compName = "InnoTech Solutions";
		
		emp3.empId = 1113;
		emp3.empName = "Madhu";
		emp3.salary = 45000;
		
		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp3.empId);
		System.out.println("Employee Name: " + emp3.empName);
		System.out.println("Employee Salary: " + emp3.salary);
		System.out.println("*****************");

		
		Employee emp4 = new Employee();
		
		emp4.empId = 1114;
		emp4.empName = "Aditya";
		emp4.salary = 40000;
		
		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp4.empId);
		System.out.println("Employee Name: " + emp4.empName);
		System.out.println("Employee Salary: " + emp4.salary);
		System.out.println("*****************");


		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp1.empId);
		System.out.println("Employee Name: " + emp1.empName);
		System.out.println("Employee Salary: " + emp1.salary);
		System.out.println("*****************");
 
		emp3.salary = 100000;
		

		System.out.println("Company ID: " + compID);
		System.out.println("Company Name: " + compName);
		System.out.println("Employee ID: " + emp3.empId);
		System.out.println("Employee Name: " + emp3.empName);
		System.out.println("Employee Salary: " + emp3.salary);
		System.out.println("*****************");

			
	}

}
