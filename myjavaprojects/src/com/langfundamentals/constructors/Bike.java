package com.langfundamentals.constructors;
//Constructor chaining using this()
public class Bike {
	
	String model;
	String brand;
	String color;
	double price;
	int year;
	
	Bike(){
		this("UNKNOWN");
		System.out.println("No-arg constructor called!!");
	
	}
	
	Bike(String model){
		this(model, "UNKNOWN");

		System.out.println("One-arg constructor called");
//		this.model = model;
	}

	Bike(String model, String brand){
		this(model, brand, 0.0);

		System.out.println("Two-arg constructor called");
//		this.model = model;
//		this.brand = brand;
	}

	Bike(String model, String brand, double price){
		this(model, brand, price, "Red");

		System.out.println("Two-arg constructor called");
//		this.model = model;
//		this.brand = brand;
//		this.price = price;
	}
	
	Bike(String model, String brand, double price, String color){
		this(model, brand, price, color, 2024);

		System.out.println("Two-arg constructor called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		
	}

	public Bike(String model, String brand, double price, String color, int year) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}


	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Bike b = new Bike();
		b.bikeInfo();
		
		Bike b1 = new Bike("FZ-S");
		b1.bikeInfo();
		
		Bike b2 = new Bike("FZ-S", "Yamaha");
		b2.bikeInfo();

		Bike b3 = new Bike("FZ-S", "Yamaha", 180000.00);
		b3.bikeInfo();

		Bike b4 = new Bike("FZ-S", "Yamaha", 180000.00, "Blue");
		b4.bikeInfo();

		Bike b5 = new Bike("FZ-S", "Yamaha", 180000.00, "Blue", 2026);
		b5.bikeInfo();

		System.out.println("main method ended");

	}
	

	void bikeInfo() {
		
		System.out.println("Model of the Bike: " + model);
		System.out.println("Brand of the Bike: " + brand);
		System.out.println("Color of the Bike: " + color);
		System.out.println("Price of the Bike: " + price);
		System.out.println("Bike MFG year: " + year);
		System.out.println("***************************************");


	}

}
