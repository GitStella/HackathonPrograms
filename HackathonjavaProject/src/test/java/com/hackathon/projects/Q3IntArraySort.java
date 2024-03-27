package com.hackathon.projects;
import java.util.HashSet;

//Q3.	Given an array of integers, sort the integer values.

import java.util.Arrays;
import java.util.Scanner;

public class Q3IntArraySort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		int n = s.nextInt();  
		int a[] = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for (int i = 0; i < n; i++)   
		{  
		a[i] = s.nextInt();  
		}  
		System.out.println("Sorted array is");
		Arrays.sort(a);
		for (int i = 0; i<=n-1; i++)
			System.out.println(a[i]);
		s.close();
		
		
	}
	

}
