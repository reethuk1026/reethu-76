package com.langfundamentals;

class Student{
	
	int sid;
	String sname;
	Address address = new Address();
	
}

class Address{
	
	String street;
	String city;
	String state;
	
}

public class TestDataTypesDemo3 {


	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.sid = 101;
		s1.sname = "Shreya";
		s1.address.street = "JNTU";
		s1.address.city = "Hyd";
		s1.address.state ="TG";
		
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
// if Address address; in Student class -----Exception in thread "main" java.lang.NullPointerException: Cannot assign field "street" because "s1.address" is null
//at com.langfundamentals.TestDataTypesDemo3.main(TestDataTypesDemo3.java:28)
//null dot any operation is NullPointerException
		System.out.println(s1.address.street);
		System.out.println(s1.address.city);
		System.out.println(s1.address.state);

	
		
		
	}

}
