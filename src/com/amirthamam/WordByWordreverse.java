package com.amirthamam;

public class WordByWordreverse {

	public static void main(String[] args) {
          String s = "Welcome To Greens Technology";
          String res = "",ans = "";
          
          String[] splt = s.split(" ");
          for (int i = 0; i < splt.length; i++) {
              System.out.println(splt[i]);
              String temp = splt[i];
              for (int j = temp.length()-1 ; j >0 ; j--) {
            	  char c = temp.charAt(j);
            	  res=res+c;
			}
              System.out.println(ans+" "+res);

			}
		}
          
}     
          
          
          
          
          
          
          
          
       
