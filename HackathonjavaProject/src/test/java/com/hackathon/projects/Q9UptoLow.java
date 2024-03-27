package com.hackathon.projects;

import java.util.Scanner;

//Q9.	How can we make String Lower case to Upper case?
public class Q9UptoLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		
		String lowerCaseString = str.toLowerCase();
		System.out.println(lowerCaseString); // hello world

	}

	
}
