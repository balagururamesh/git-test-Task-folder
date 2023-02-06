package com.day_6;

/*  QUESTION 2:
-----------
Description: Find the particular character index  in the given string  */
public class CharecterInd {

	public static void main(String[] args) {
		String s1=" GreensTechnology";
		String s2=" SeleniumAutomationtool";
		String s3=" velmurugan@123";
		String s4=" j a v a p r o g r a m";
		String s5=" 9095484678";
		
		int indexOf1 = s1.indexOf("G");
		System.out.println(indexOf1);
		
		int indexOf2 = s1.indexOf("g");
		System.out.println(indexOf2);          //case sensitive

		int indexOf3 = s2.indexOf("e");
		System.out.println(indexOf3);
		
		int indexOf4 = s3.indexOf("p");       //if we put unpresent value it gives -1
        System.out.println(indexOf4);

		int indexOf5 = s4.indexOf("m");
		System.out.println(indexOf5);
		
		int indexOf6 = s5.indexOf("5");
		System.out.println(indexOf6);

		int indexOf7 = s5.indexOf("2");      //if we put unpresent value it gives -1
		System.out.println(indexOf7);
    }

}
