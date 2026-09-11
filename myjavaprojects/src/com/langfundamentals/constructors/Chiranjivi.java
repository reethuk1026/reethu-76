package com.langfundamentals.constructors;

public class Chiranjivi {

	
	int age;
	int moviesCount;
	{
		System.out.println("instance block called");
	}

	public Chiranjivi() {
//	super();
	System.out.println("Chiru no arg constructor called!!");
	
}

	
	public Chiranjivi(int age, int moviesCount) {
		System.out.println("parameterized conctsructor called");
//		super();
		this.age = age;
		this.moviesCount = moviesCount;
	}

	public static void main(String[] args) {
		
		System.out.println("Main method started for Chiru");
		
		Chiranjivi ch = new Chiranjivi();
		
		Chiranjivi ch1 = new Chiranjivi(72,160);
		
		
	}


}

//Implicit super constructor Chiranjivi() is undefined for default constructor. Must define an explicit constructor
class RamCharan extends Chiranjivi{
	
//	public RamCharan() {
//		System.out.println("Constructor called for Ram");
//	}
	
	public static void main(String[] args) {
		System.out.println("Main method started for Ram");
		
		RamCharan r1 = new RamCharan();
		r1.show();
		
		System.out.println("Main method ended for Ram");

		
	}
	
	void show() {
		
		System.out.println("show method called");
		System.out.println("Age of the Hero:" + age);
		System.out.println("Movies count: " + moviesCount);

	}
}