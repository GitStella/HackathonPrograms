package com.hackathon.projects;
//Q19. WJP to display number of occurrence of all character
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q19NoOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Value = str.nextLine();
		Map<Character, Integer> Occurcount = new HashMap<>();
		for (Character C : Value.toCharArray()) {
			if (Occurcount.containsKey(C))
				Occurcount.put(C,Occurcount.get(C)+1);
			else
				Occurcount.put(C,1);
		}
		System.out.println(Occurcount);
		str.close();
		}
	}


