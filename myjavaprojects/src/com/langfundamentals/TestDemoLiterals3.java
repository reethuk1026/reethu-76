package com.langfundamentals;

//char literals, boolean literals & null literals
public class TestDemoLiterals3 {

	public static void main(String[] args) {
		
       System.out.println("main method started");
//       char literals
		char c = 'S';//single quote characters
		char c1 = 65;//ACII values
	    char c2 = 6556;
// boolean literals
//only true or false values can be stored in boolean	    
	    boolean areStudentsAreSeriousAboutTheirJob = true;
	    boolean areStudentsAreRocking = false;

	    if(areStudentsAreSeriousAboutTheirJob) {
	    	System.out.println("They will get a job in 4 to 6 months");
	    }else {
	    	System.out.println("Those who are not serious are conisdered as time-pass batch");
	    }
	    
//null Literals
//for every object we can store null Literal directly	
//If we want to declare object with empty then we will use null literal.	    
	    String s = null;
	    TestDemoLiterals3 t1 = null;
	    
	    s = "Shreya";
	    
	    System.out.println(s);
	    System.out.println(t1);

	    
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println('\u0020'); //default value of char is \u0020
		System.out.println('\u0040');
		System.out.println('\uface');
		System.out.println('\uabcd');
		System.out.println("main method ended");
	}

}


