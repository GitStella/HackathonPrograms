package com.hackathon.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
public class Q20DupCountIntUpLow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		char currentCharacter = 0;
		int countup = 0;
		int countlow = 0;
		int countint=0;
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    String Value = scanner.nextLine();
				    
		    List<Character> duplicateCharacters = new ArrayList<>();

		    for (int i = 0; i < Value.length(); i++) {
		       currentCharacter = Value.charAt(i);
		      if (duplicateCharacters.contains(currentCharacter)) {
		    	   System.out.print(currentCharacter);
		    	   if (Character.isUpperCase(currentCharacter))
		    		   countup = countup+1;
		       	   else if (Character.isLowerCase(currentCharacter)) 
		    		   countlow = countlow+1;
		    		   else if (Character.isDigit(currentCharacter))
		    			   countint = countint+1;
		    	  }
		    	   else {
		        duplicateCharacters.add(currentCharacter);
		      }
		    }
		    	System.out.println("\n");
				System.out.println("No. Of Integers :" + countint);	
				System.out.println("No. Of UpperCase in Duplicate Characters :" + countup);	
				System.out.println("No. Of LowerCase in Duplicate Characters :" + countlow);	
				scanner.close();
				
	}

}
