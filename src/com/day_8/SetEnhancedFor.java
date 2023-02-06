package com.day_8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEnhancedFor {

	public static void main(String[] args) {
		Set<Integer> st = new LinkedHashSet<Integer>();
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
		
// Get the each value of set by using enhanced  for loop
		
System.out.println("the values of the set is : ");

for (Integer s : st) {
	System.out.println(s);
}			
		}
	}


