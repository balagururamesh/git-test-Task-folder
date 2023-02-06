package com.day_7;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndex {

	public static void main(String[] args) {
List<Integer> li = new ArrayList();

/*  QUESTION 4.1 : Create a new ArrayListlist with values and
  find the length of it
              Input : List = 10,20,30,90,10,10,40,50  */
li.add(10);
li.add(20);
li.add(30);
li.add(90);
li.add(10);
li.add(10);
li.add(40);
li.add(50);

	System.out.println(li);
	int size = li.size();
	System.out.println("the length of the List is = "+size);
	
	}

}
