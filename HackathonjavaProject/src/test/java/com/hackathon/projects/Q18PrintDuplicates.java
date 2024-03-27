package com.hackathon.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q18PrintDuplicates {
//Q18. WJP to display duplicate character in string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter a string: ");
		    String string = scanner.nextLine();

		    List<Character> duplicateCharacters = new ArrayList<>();

		    for (int i = 0; i < string.length(); i++) {
		      char currentCharacter = string.charAt(i);

		      if (duplicateCharacters.contains(currentCharacter)) {
		        System.out.print(currentCharacter);
		      } else {
		        duplicateCharacters.add(currentCharacter);
		      }
		    }

		    scanner.close();
		
	}

}
