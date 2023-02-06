package com.day2;

import java.util.Scanner;

public class ScannerProg {

	public static void main(String[] args) {
		
		/* Using Scanner class get the below details
	empId, empName,age,empPhoneno,empSalary */
			             
		Scanner scnr = new Scanner(System.in);  // Create a Scanner object
	   
		System.out.println("Enter empId");
        String empId = scnr.nextLine();  // Read user input
	    System.out.println("empId is: " + empId);  // Output user input
	    
	    System.out.println("Enter empName");
	    String empName = scnr.nextLine();  
	    System.out.println("empName is: " + empName);  
	    
	    System.out.println("Enter Age");
	    int age = scnr.nextInt();  
	    System.out.println("Age is: " + age);  
	     
	    System.out.println("Enter empPhoneno");
	    Long empPhoneno = scnr.nextLong();  
	    System.out.println("empPhoneno is: " + empPhoneno);  
	    
	    System.out.println("Enter empSalary");
	    double empSalary = scnr.nextDouble();  
	    System.out.println("empSalary is: " + empSalary); 
	       
      	
	}

}
