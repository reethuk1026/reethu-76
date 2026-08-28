package com.langfundamentals; //com,langfundamentals -identifiers
import java.util.Scanner;

public class Student_1 {  //student_1 --identifier
	
	int student_Id;    //student_Id, student_Name -- identifiers
	String student_Name; // instance variables
	double fee$; //fee$,_age --identifiers
	int _age;
	
	void studentInfo() { //studentInfo- identifier
		
		System.out.println("Student Info method called"); //system,println --identifiers
	}//instance method
	

	public static void main(String[] args) {   //main,args -- identifiers
		
		
		
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		
		Student_1 s1 = new Student_1(); //s1 --identifier
		
		System.out.println(s1.student_Id);
		System.out.println(s1.student_Name);
		s1.studentInfo();

		System.out.println("Main Method ended !!");
	}

}
