package com.langfundamentals.constructors;

//Parent or Super or Base class
public class Human {
	
	String name;
	int age;
	
	Human(){
		System.out.println("Human constructor called!!!");
	}
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		

		System.out.println("main method started");
	}
	
}	
//Child or Sub or Derived class	
class Person extends Human{
	
	{
		System.out.println("Instance block called");
	}
	
	Person(){
		super(); //whether we declare or not by default super() is going to call super class functionalities
		System.out.println("Person constructor called !!!");
	}
	
	Person(String name, int age){
	//	super(name, age);
		super.name = name;
		super.age = age;
		System.out.println("Two-arg contructors called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started from person");
		
		Person p = new Person();
			p.info();
			
		Person p1 = new Person("Shreya", 2 );	
		p1.info();
	}
	
	void info() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("-------------------------");

	}
	
	
}


