package com.day_7;

import java.util.LinkedList;

public class ListForLoop {

	public static void main(String[] args) {
		//Input:   List = 105,205,305,405,505,605,705,805

		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);

//Description : Get the each value of list by using normal for loop
System.out.println(li);

for(int i=0;i<(li.size());i++)  {
System.out.println(li.get(i));
}
	}

}
