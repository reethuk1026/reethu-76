package com.langfundamentals;
//Types of variables

//Static Variables: The class level variables creating static keyword will consider as static variables
//If the data is same for all the objects then we use static for such data
//Static data can be accessed without object creation
//Can access within class directly, 
//we can access outside the classes by using class name	
//can also be accessed by using object reference variable

//Instance Variables: The class level variables without static will consider as Instance.
//If the data is changing from Object to Object then we use instance for such data.	
//Instance data, we can access only through object reference variable.	

//Local variables: The block or method level variables are considered as local variables.
//If we want to maintain Temporary data within the block or method then we use instance for such data
//Local variables can be accessed directly
//Q)For Local variables can we keep static? Ans: No, it give CE: Illegal modifier for parameter org_Id; only final is permitted
//The only applicable modifier for local variables is final.
public class Employee {
		
//Primitive + instance	
	int emp_Id;
//Object +instance	
	String emp_Name;
	
		
//Primitive + Static	
	static int org_Id = 555;
//Primitive + Static	
	static String org_Name = "Vcube" ;

	public static void main(String[] args) {

		System.out.println("Main method Started");
		
		int org_Id = 666;
		String org_Name = "VSS";
		
		System.out.println(org_Id); //666
		System.out.println(org_Name);//VSS

		
		Employee e1 = new Employee();
//intializing instance data		
		e1.emp_Id = 101;
		e1.emp_Name = "Shreya" ;
		
//Primitive + Local		
		int age;
		age = 28;
//Object + local	
		String city;
		city = "Hyd";
		
//Accessing local variables
//Local variables should be intialized before accessing orelse we get CE:The local variable age may not have been initialized
//we cannot access local variables without initialization		
		System.out.println(age);
		System.out.println(city);

		
//Accessing static data directly is possible within the class only
		System.out.println("Accessing Static data directly!!");
		System.out.println(org_Id); //default -0
		System.out.println(org_Name); //default -null
//If we want to access the static data outside of classes then we use classname.static data		
		System.out.println("Accessing static data by using class name");
		System.out.println(Employee.org_Id);
		System.out.println(Employee.org_Name);

//If we want to access the static data using object reference variable we get compile time warning
// CW:The static field Employee.org_Id should be accessed in a static way (by using Class name)		
		System.out.println("Accessing static data by using object reference variable");
		System.out.println(e1.org_Id);
		System.out.println(e1.org_Name);
//Instance data can be accessed only through Object reference variable
//Accessing the instance data by using object reference variables
		System.out.println(e1.emp_Id); //default-0
		System.out.println(e1.emp_Name);//default-null
		
//Even though e2 is null, static data will load
//so there is no impact to call static data by using object reference variable.
//Hence, the recommended approach to access static data is by using class name only	
//		Employee e2 = null;
//		System.out.println(e2.org_Id);
//		System.out.println(e2.org_Name);
//		
//		System.out.println(e2.emp_Id);//NPE
//		System.out.println(e2.emp_Name);//NPE


		System.out.println("Main Method Ended");

		
		
	}

}
