package com.day_7;

import java.util.LinkedList;

public class ListCollectionDemo {

	public static void main(String[] args) {
// Input:   List = 10,20,30,90,10,10,40,50 

		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
System.out.println(li);

//  Get the first index value of 30

int indxof = li.indexOf(30);
System.out.println("the first index value of 30 is = "+indxof);

//   Get the last index value of 10 
int lstindof = li.lastIndexOf(10);
System.out.println("the last index value of 10 is = "+lstindof);
	}

}
