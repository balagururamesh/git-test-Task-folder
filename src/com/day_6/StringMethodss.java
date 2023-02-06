package com.day_6;
public class StringMethodss {

	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		String s2 = "Greenstechnology";
		String s3 = "bala9655gmail.com";
		String s4 = "909548467";
		
		/* Description: Find the particular character in the given string
		   String 1: GreensTechnology ----- print the character h */
		
		int indexOf1 = s1.indexOf("h");
		char charAt1 = s1.charAt(indexOf1);
		System.out.println(charAt1);
		
		//Example(use equalsIgnoreCase)
		
		boolean eqlsIgnrCase = s1.equalsIgnoreCase(s2);
		System.out.println(eqlsIgnrCase);
		
		//Description: Get the email id from the user and verify '@' is present or not?

		boolean cntns = s3.contains("@");
		System.out.println(cntns);
		
	//	Description:Get the phonenumber from the user  .
      //  If phonenumber exceeds greater than 10 then return invalid number

		int length1 = s4.length();
		if(length1<10 || length1>10) {
			System.out.println("INVALID PHONE NUMBER");
		}
		else {
			System.out.println("VALID PHONE NUMBER");
		}
	}
}
