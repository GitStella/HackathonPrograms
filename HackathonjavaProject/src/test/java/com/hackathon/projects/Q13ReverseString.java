package com.hackathon.projects;

import java.util.Scanner;

//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
public class Q13ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Value = str.nextLine();
		StringBuilder input = new StringBuilder(Value);
		//System.out.println(input.toString());
		
		   StringBuilder output = new StringBuilder(input).reverse();
		    System.out.println(output.toString());
		}
		}	


