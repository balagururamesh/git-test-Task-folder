package com.day_4;

/*QUESTION 1:
-----------
Description: Write Java program to allow the user to input his/her age.     
             Then the program will show if the person is eligible to vote.
             A person who is eligible to vote must be older than or equal 1 to 18 years old.
Example:Input  = 10, Output = print not eligible.*/

public class VoteEligible {
	
	public static void main(String[] args) {
		int age = 54;
	
	if (age>0 && age<18)
	{
		System.out.println("not eligible");
	}
	else if (age>0 && age>18)
	{
		System.out.println("eligible");
	}
	else {
		System.out.println("age is not valid");
	}
	}
}

