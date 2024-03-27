package com.hackathon.projects;
//Q4.	Given an array of integers check the Palindrome of the series.
import java.util.Scanner;

public class Q4Palindrome {

		  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the number of elements in the array: ");
		    int n = scanner.nextInt();
		    System.out.print("Enter the elements of the array: ");
		    int[] array = new int[n];
		    for (int i = 0; i < n; i++) {
		      array[i] = scanner.nextInt();
		    }
		    scanner.close();
		    boolean isPalindrome = true;
		    for (int i = 0; i < n / 2; i++) {
		      if (array[i] != array[n - i - 1]) {
		        isPalindrome = false;
		        break;
		      }
		    }
		    if (isPalindrome) {
		      System.out.println("The array is a palindrome.");
		    } else {
		      System.out.println("The array is not a palindrome.");
		    }
		  }
	
	 }
	


