package com.day_8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeRetain {
	
//Create a new TreeSet with values and return the common values
	
	public static void main(String[] args) {
	
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		ts.add(90);
		ts.add(10);
		ts.add(20);
		Set<Integer> tc = new TreeSet<Integer>();
		tc.add(100);
		tc.add(200);
		tc.add(300);
		tc.add(400);
		tc.add(60);
		tc.add(70);
		tc.add(800);
		tc.add(900);
		tc.add(10);
		tc.add(20);
		System.out.println("set 1 : "+ts);  //set will not allow duplicates
		System.out.println("set 2 : "+tc);  //TreeSet --ascending order 

		ts.retainAll(tc);
		System.out.println("The common collection is : " +ts);
	}

}
