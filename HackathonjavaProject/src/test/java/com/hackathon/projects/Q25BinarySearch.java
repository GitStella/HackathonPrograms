package com.hackathon.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Q25BinarySearch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter number of Elements");
		int count = s.nextInt();
		System.out.println("Enter number of Elements");
		 	for (int i = 0; i <count; i++)   
			list.add(s.nextInt());
			System.out.println("Enter the number to be searched");
			int n = s.nextInt();
			
			int first = 0;
			int last = count-1;
			int middle =  (first/last)/2;
			while( first <= last )
		      {
		         if ( middle < n )
		           first = middle +1 ;
		         else if ( middle == n )
		         {
		           System.out.println(n + " found at location " + (middle+1 ) + ".");
		           break;
		         }
		         else
		         {
		             last = middle - 1;
		         }
		         middle = (first + last)/2;
		      }
		      if ( first > last )
		          System.out.println(n + " is not found.\n");
	}

}
