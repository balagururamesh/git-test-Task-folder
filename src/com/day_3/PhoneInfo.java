package com.day_3;
//QUESTION 4 : Description//
//You have to overload the method phoneInfo() based on different datatype order in arguments.//

public class PhoneInfo {
	private void phoneDetail() {
		System.out.println("phone name   : MOTROLA");
	}
	private void phoneDetail(String model) {
		System.out.println("phone model  : "+model);
		
	}
	
	private void phoneDetail(int ram) {
		System.out.println("RAM size     : "+ram+"GB");

	}

	private void phoneDetail(int inch, String colour) {
		System.out.println("Display  size : "+inch+"cm");
		System.out.println("Phone colour  : "+colour);
		
	}
	public static void main(String[] args) {
		PhoneInfo i = new PhoneInfo();
		i.phoneDetail();
		i.phoneDetail("emax");
	    i.phoneDetail(6);
	    i.phoneDetail(10, "BLACK");
	}
	
}
