package com.amirthamam;
public class ReverseSingle {

	public static void main(String[] args) {
        String s = "Welcome To Greens Technology";
        System.out.println("Given String    : "+s);
        
        String fin = "";
        String[] splt = s.split(" ");
        
        for (int j = 0; j < splt.length; j++) {
        String r = splt[j];
        String res = "";
        int n= r.length();
        
        for (int i = n-1; i >= 0; i--) {
      	 char c = r.charAt(i);
      	 res = res+c;
		}
        
        fin=fin+" " +res;

	}
        System.out.println("Reversed String : "+fin);

	}
}