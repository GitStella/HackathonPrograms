package com.hackathon.projects;
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.

import java.util.Scanner;

public class Q25BinarySr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the number of elements: ");
	    int n = scanner.nextInt();

	    System.out.print("Enter the elements in sorted order: ");
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scanner.nextInt();
	    }

	    System.out.print("Enter the element to search for: ");
	    int x = scanner.nextInt();

	    int result = binarySearch(arr, 0, n - 1, x);

	    if (result == -1) {
	      System.out.println("The element is not found.");
	    } else {
	      System.out.println("The element is found at index " + result + ".");
	    }scanner.close();
	  }

	  public static int binarySearch(int[] arr, int low, int high, int x) {
	    if (high >= low) {
	      int mid = (low + high) / 2;

	      if (arr[mid] == x) {
	        return mid;
	      } else if (arr[mid] > x) {
	        return binarySearch(arr, low, mid - 1, x);
	      } else {
	        return binarySearch(arr, mid + 1, high, x);
	      }
	    }
	    return -1;
	    
	}
	  
}
