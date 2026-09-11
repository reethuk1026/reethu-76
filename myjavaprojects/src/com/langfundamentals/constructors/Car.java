package com.langfundamentals.constructors;

public class Car {
	
	String model;
	String brand;
	String color;
	double price;
	int year;
	
	
//5arg constructor (parameterized)	
//Public - can through out the project	
public Car(String model, String brand, String color, double price, int year) { 
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}

//parameterized constructor (3arg)
//private - can access within the class
	private Car(String model, String brand, String color){
		System.out.println("3-Parameterized constructor called");
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
//no-arg constructor
//protected - can access within the class and outside of the packages sub-classes	
	protected Car(){
		System.out.println("No-arg constructor called");
		
	}
	
	public static void main(String[] args) {

		System.out.println("main method started");

		Car c = new Car("Punch", "Tata", "Red");
		c.carInfo();
		
		Car c1 = new Car();
		c1.brand = "Audi";
		c1.carInfo();
		
		Car c2 = new Car("Baleno", "Suzuki", "Blue", 1000000, 2026);
		c2.carInfo();
		
	}

	void carInfo() {
		System.out.println("*************************");
		System.out.println("Model of the car: " + model);
		System.out.println("Brand of the car: " + brand);
		System.out.println("Color of the car:" + color);
		System.out.println("Price of the car: " + price);
		System.out.println("Car mfg year: " + year);

	}
	
}
