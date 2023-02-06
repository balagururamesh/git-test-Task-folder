package com.amirthamam;

public class PrinFrstTenPrimeNumbers {

	public static void main(String[] args) {
		System.out.println("First 10 prime numbers are :");
		int count=0,var;
		for(int i=2; count<10; i++)
	      {
	         var = 0;
	         for(int j=2; j<i; j++)
	         {
	            if(i%j==0)
	            {
	               var++;
	               break;
	            }
	         }
	         if(var==0)
	         {
	            System.out.print("\n "+i);
	            count++;
	         }
	
		

		
		
}
	}

}



