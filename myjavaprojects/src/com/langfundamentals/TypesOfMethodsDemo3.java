package com.langfundamentals;
import java.util.Scanner;

//No Return type + with parameters 
//Read the elements from the console
//FOr any Java class, if there are no constructors, Java compiler creates a default constructor which we cannot see

//WAP to print Student Details
public class TypesOfMethodsDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		
	
//		Scanner sc = new Scanner(); //CE:The constructor Scanner() is undefined
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID : ");
		int sid = sc.nextInt();
		
		
		System.out.println("Enter Student Name: ");
		String sname = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your City: ");
		sc.nextLine();
		String city = sc.nextLine();
		
		System.out.println("Enter your Gender: ");
		char gender = sc.next().charAt(0);//Method chaining 
		
//METHODS CALL BY VALUES		
		getStudent_Id_Name_Info(sid, sname);
		getStudentAgeInfo(age);
		getStudentCity(city);
		getGenderInfo(gender);
//		System.out.println(id);
//		System.out.println(name);
	
	
		System.out.println("main method ended");

		
	}
	
	static void getStudentAgeInfo(int age) {
		
		System.out.println("Student Age is: " + age);
		
	}

	
	static void getStudent_Id_Name_Info (int id, String name){
		
		System.out.println("Student Info");
		System.out.println("Student ID: " + id);
		System.out.println("Student Name:" + name);
	}
	
	
	static void getStudentCity(String city) {
		
		System.out.println("City: " + city);
	}
	
	static void getGenderInfo(char gen) {
		
		System.out.println("Student gender: " + gen);
	}
	
}
