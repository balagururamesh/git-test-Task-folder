package com.amirthamam;
public class FirestCapital {

	public static void main(String[] args) {
		
		String sg = "welcoMe To GrEeNs teChnoloGy";
        System.out.println("Given String : "+sg);
        String fin = "";

        String[] splt = sg.split(" ");
        
        for (int j = 0; j < splt.length; j++) {
        String r = splt[j];
        String s1 = r.substring(0, 1).toUpperCase();
        String s2 = r.substring(1).toLowerCase();
        String s3 = s1+s2;

        fin=fin+" " +s3;
	 	                        	
        }
      System.out.println("\n After Capitalized of 1st letter : \n"+fin);

      
      
      
      
		}
	}


