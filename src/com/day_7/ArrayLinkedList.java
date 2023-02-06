package com.day_7;

import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
		
/* QUESTION 4.2 : Create a new LinkedListlist with values and 
   find the length of it
   Input : List = 100,200,300,400,500,600,700,500 */
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		li.add(500);
		
System.out.println(li);
		
        int length = li.size();
		System.out.println("the size of the List is = "+length);
		
	}

}
