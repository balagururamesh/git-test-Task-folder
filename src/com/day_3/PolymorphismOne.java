package com.day_3;

//QUESTION 2:Description//
//You have to overload the method empId() based on different datatype in arguments.//

public class PolymorphismOne {
	
	private void companyName() {
		System.out.println("company name : MICROMAX");

	}
	private void companyName(String name) {
		System.out.println("company name : "+name);
		
	}
	private void companyName(String name1, String name2) {
		System.out.println("company name : "+name1);
		System.out.println("company name : "+name2);
		
	}
	public static void main(String[] args) {
		PolymorphismOne p = new PolymorphismOne();
		p.companyName();
		p.companyName("SAMSUNG");
		p.companyName("NOKIA", "MOTROLA");
	}
}
