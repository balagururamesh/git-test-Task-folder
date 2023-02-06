package com.day_8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedHashsetCreation {

	public static void main(String[] args) {
LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
System.out.println("List values : " +li);

//Convert the below list in to set(use addAll()) method

		Set<Integer> st = new LinkedHashSet<>();
		st.addAll(li);
		System.out.println("Set values : " +st);
	}

}
