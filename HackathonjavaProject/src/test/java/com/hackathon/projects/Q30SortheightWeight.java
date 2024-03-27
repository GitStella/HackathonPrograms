package com.hackathon.projects;
//Q33. A circus is designing a tower routine consisting of people standing 
//atop one another’s shoulders. For practical and aesthetic reasons, 
//each person must be both shorter and lighter than the person below him or her. 
//Given the heights and weights of each person in the circus, write a method to 
//compute the largest possible number of people in such a tower.
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;


public class Q30SortheightWeight {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap <Integer, Integer> St = new TreeMap <Integer, Integer>();
		System.out.println("Enter the height and weight of 4 persons");
		for (int i=0; i<4;i++)
		{
			St.put(sc.nextInt(), sc.nextInt());
		}

		for(Entry<Integer, Integer> displaymap : St.entrySet()) {
			System.out.println("(" + displaymap.getKey() + ","+ displaymap.getValue()+ ")");
		}
	}

}
