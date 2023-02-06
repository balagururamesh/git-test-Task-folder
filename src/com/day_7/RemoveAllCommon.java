package com.day_7;

import java.util.LinkedList;

public class RemoveAllCommon {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		LinkedList<Integer> lc = new LinkedList<Integer>();

		/* Create a new ArrayListlists with values and perform removeAll() function
		   Input : List = 10,20,30,90,10,10,40,50  Input : List = 10,20,60,50,40,70,80,90 */
		        li.add(10);
				li.add(20);
				li.add(30);
				li.add(90);
				li.add(10);
				li.add(10);
				li.add(40);
				li.add(50);
		System.out.println("List 1 : "+li);

		        lc.add(10);
		        lc.add(20);
		        lc.add(60);
		        lc.add(50);
		        lc.add(40);
		        lc.add(70);
		        lc.add(80);
		        lc.add(90);
		System.out.println("List 2 : "+lc);
		
li.removeAll(lc);
System.out.println("After remove the common values of List1 and List2 is : "+li);
	}

}
