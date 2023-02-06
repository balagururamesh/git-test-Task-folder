package com.day_3;
 
public class Arts extends Education {
	
	private void batchellorScience() {
		System.out.println("Department  : ELECTRONICS");
	     System.out.println("Year of Studying : FIRST");
	}
	private void businessAdministration() {
		System.out.println("Department  : BBA");
	     System.out.println("Year of Studying : FIRST");
	}
	private void batchellorArts() {
		System.out.println("Department  : ENGLISH");
	     System.out.println("Year of Studying : Second");
	}
	
	public void underGraduate() {
	     System.out.println("Department : EEE");
	     System.out.println("Year of passing : 2019");
		}
		
		public static void postGraduate() {
			
		    System.out.println("Department : CIVIL");
		    System.out.println("Year of passing :2022");

		}
public static void main(String[] args) {
	Arts ed = new Arts();
	Education ar = new Education();

	ed.batchellorArts();
	ed.batchellorScience();
	ed.businessAdministration();
	ar.underGraduate();
	ar.postGraduate();
}

}
