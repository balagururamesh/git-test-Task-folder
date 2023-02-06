package com.amirthamam;
import java.util.*; 
public class MergingTwoArraw {

	public static void main(String[] args) {
		int a[]= {5,7,3,2,8};
		int b[]= {1,4,9,6,0};
		int c[]=new int[a.length+b.length];
		for (int i=0 ; i<a.length;i++) {
			c[i]=a[i];
		}
int j=0;
	for(int i=a.length;i<c.length;i++)
	{
		c[i]=b[j];
		j++;
	}
System.out.println(Arrays.toString(c));
	 for (int i = 0; i < c.length; i++) {
		
	for (int k = i+1; k < c.length; k++) {
			
		if (c[i]>c[k]) {
			int s = c[i];
			c[i]=c[k];
			c[k]=s;
		}			
		}
		
	}
	System.out.println(Arrays.toString(c));
	
	}
}
