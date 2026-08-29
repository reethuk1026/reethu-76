package com.langfundamentals;

import java.util.Scanner;

//with return type + with parameters
//WAp to print
//-Area of sqaure --> side* side
//-Area of Rectangle-->length * breadth
//-Area of Triangle --> 0.5*base*height
//-Area of Circle--> PI*r*r
public class TypesOfMethodsDemo4 {

	 void main(String[] args) {

          
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		float side = sc.nextFloat();
		float aS = findAreaOfSquare(side);
		System.out.println("Area of Square: " + aS);
		
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        double aR = findAreaOfRectangle(length, breadth);
        System.out.println("Area of Rectangle: " + aR);
        
        System.out.println("Enter Base: ");
        double base = sc.nextDouble();
        System.out.println("Enter Height: ");
        double height = sc.nextDouble() ;
        double aT = findAreaofTriangle (base, height);
        System.out.println("Area of Triangle: " + aT);
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double aC = findAreaOfCircle(radius);
        System.out.println("Area of Circle: " + aC);

		System.out.println("main method ended");

		
	}
	
	float findAreaOfSquare(float side){
		float aS = side * side;
		return aS;
	}
	
	double findAreaOfRectangle(double length, double breadth) {
		
		double aR = length * breadth;
		return aR;
	}

	double findAreaofTriangle(double base, double height) {
		double aT = 0.5*base*height;
		return aT;
	}
	
	double findAreaOfCircle(double radius) {
		double aC = Math.PI*radius*radius;
		return aC;
	}
	
	
}
