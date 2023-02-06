package com.day2;

public class ProdOfNum {

	public static void main(String[] args) {
int num = 679032;
int res=1, rem=0,number=num;
while (num>0) {
	rem=num%10;
	if (rem==0) {
		continue;

	} else {
		res=res*rem;
		num=num/10;
	}
	
	
}
System.out.println(number);
		System.out.println(res);
		
	}

}
