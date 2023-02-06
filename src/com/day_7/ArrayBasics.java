package com.day_7;


public class ArrayBasics {
	
public static void main(String[] args) {
	
	int a[] = {1, 2, 3, 4, 5, 2 , 6, 1 , 5 , 7, 8, 9, 10}, sum = 0;  
    
	//QUESTION 1 : Write a Java program to sum values of an array
    
	for (int i = 0; i < a.length; i++) {   
       sum = sum + a[i];  
    }    
    System.out.println("Sum of all the elements of an array: " + sum);  

    int l = a.length;
    System.out.println(l);
    
    //QUESTION 2 : calculate the average value of array elements.

   double avg = sum / (l);
   System.out.println("the average of the array is = " +avg);

}
}
