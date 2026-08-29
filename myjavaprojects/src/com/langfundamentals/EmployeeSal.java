package com.langfundamentals;
import java.util.Scanner;

//with return type +no parameters
public class EmployeeSal {
	
	   static Scanner sc = new Scanner(System.in);

	

	public static void main(String[] args) {

		System.out.println("Main method started!!");
		
		EmployeeSal es = new EmployeeSal();
		
		double sal = es.employeeSalary();
		double bonus = es.employeeBonus();
	
		System.out.println("Total Salary is: " + (sal+bonus));
		
		System.out.println("Main method ended!!");

	}
	
	double employeeSalary(){
	
//		Scanner sc = new Scanner(System.in);
		System.out.println("Employee salary is: ");
		double sal = sc.nextDouble();
		return sal;
//		return 500000;

		
	}
	
	double employeeBonus() {
		
//		double bonus = 0;
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bonus: ");
		double bonus = sc.nextDouble();
		return bonus;
//      return 5000;		
	}
		
}
