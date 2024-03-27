package com.hackathon.projects;
//Q5.	Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Q5UniqueDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		int n = s.nextInt();  
		int a[] = new int[n];  
		int count =1;
		System.out.print("Enter the elements of the array: ");  
		for (int i = 0; i < n; i++)   
		{  
		a[i] = s.nextInt();  
		}  s.close();
HashSet <Integer> HS = new HashSet <Integer>();
		for (int unique : a)
			if (!HS.contains(unique)) {
		        HS.add(unique);
		      }
		System.out.println("Unique Elements ");
		for (int unique : HS)
			System.out.println(unique);
		for (int i = 0; i < a.length; i++) {
	        boolean duplicate = false;
	        int j = 0;
	        while (j < i){
	           if ((i != j) && a[i] == a[j]) {
	                duplicate = true;
	            }
	            j++;
	        }
	        if (duplicate) {
	            System.out.print("Duplicate Elements " + a[i] + " ");
	          	            
	        }
	    }
	        }  
}

