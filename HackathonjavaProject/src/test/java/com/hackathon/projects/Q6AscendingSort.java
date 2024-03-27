package com.hackathon.projects;
//Q6 - WJP to perform ascending order Selection  sort
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q6AscendingSort {

	public static void main(String[] args)throws Exception {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
	   
		        System.out.println("Enter 5 numbers:");  
		for (int i = 0; i < 5; i++)   
		{  
			list.add(s.nextInt());
	    // Sort the list in ascending order
	    Collections.sort(list);
		}
	    // Print the sorted list
	    System.out.println("The Sorted List is");
	    for (int j = 0; j < list.size(); j++) {
	      System.out.println(list.get(j));
	    }
				
	s.close();

	}
}