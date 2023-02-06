package com.day_8;

import java.util.HashSet;
import java.util.Set;

public class HashsetCreation {

	public static void main(String[] args) {

		/*  Create a HashSet for the below values
    Input : List = 10,20,30,40,50,60,70,80,90,10,20 */
		
		Set<Integer> st = new HashSet<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(60);
		st.add(70);
		st.add(80);
		st.add(90);
		st.add(10);
		st.add(20);
		
		System.out.println("Input List =[ 10,20,30,40,50,60,70,80,90,10,20]");
		System.out.println("output List ="+st);
		
		
		

	}

}
