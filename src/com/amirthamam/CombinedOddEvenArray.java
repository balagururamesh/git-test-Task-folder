package com.amirthamam;
import java.util.Arrays;
public class CombinedOddEvenArray {
public static void main(String[] args) {
int a[]= {19,16,8,3,14,7,2,11,13,1};
//int []arr=new int[a.length];
int count=0;
for (int c = 0; c < a.length; c++) {
	if (a[c]%2==0) {
		count++;
	} 
}
System.out.println("giver numbers are : "+Arrays.toString(a));
int b[]=new int[count];
int c[]=new int[a.length-count];
for (int i = 0,j=0,k=0; i < a.length; i++) {
if (a[i]%2==0) {
	b[j]=a[i];
	j++;
}
else {
	c[k]=a[i];
	k++;
}
	}
System.out.println("even numbers are : "+Arrays.toString(b));
System.out.println("Odd numbers are : "+Arrays.toString(c));
System.out.println("goodmornig balu");


}
}
	
