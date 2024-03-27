package com.hackathon.projects;
import java.util.HashMap;
import java.util.Scanner;


//Q15. Given a string print the unique words of the string.

public class Q15UniqueString {
	
	public static void main(String[] args) throws Exception {
		
		  Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter a string: ");
		    String string = scanner.nextLine();

		    HashMap<String, Integer> Count = new HashMap<>();
		    for (String word : string.split(" ")) {
		      if (Count.containsKey(word)) {
		        Count.put(word, Count.get(word) + 1);
		      } else {
		        Count.put(word, 1);
		      }
		    }

		    for (String word : Count.keySet()) {
		      if (Count.get(word) == 1) {
		        System.out.print(word + " ");
		      }
		    }

		    System.out.println();
		    scanner.close();
	    }
	
	}
