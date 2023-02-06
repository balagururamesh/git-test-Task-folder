package com.day_4;

/*  QUESTION 4:
------------
Description: Find the sum of odd number 1 to 100
Example: Output = 2500 */

public class SumOfOdd {

	public static void main(String[] args) {
		int sum = 0;
for(int b = 1; b <= 100; b++) {
	if (b % 2 != 0)
	{
		sum = sum+b;
	}
	
	}
System.out.println("the sum of odd number 1 to 100 is" +sum);
	}
			}
	

