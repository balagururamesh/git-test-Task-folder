package com.day_5;

/* 1.Constructor and types*
QUESTION 1   */


public class Aclass {

		public Aclass() {
		    this("JAVA");
		    System.out.println("Default const...");
		  }

		  public Aclass(int id) {
		    this(3456.5678f);
		    System.out.println(id);
		  }

		  public Aclass(String name) {
		    this(12);
		    System.out.println(name);
		  }

		  public Aclass(float sal) {
		    System.out.println(sal);
		  }

		  public static void main(String[] args) {
			  Aclass a = new Aclass();
		  
	}

}
