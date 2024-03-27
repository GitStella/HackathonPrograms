package com.hackathon.projects;
//Q21. WJP to convert string to int
import java.util.Scanner;

public class Q21StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		//String s="200";  
		//Converting String into int using Integer.parseInt()  
		int i=Integer.parseInt(str);  
		//Printing value of i  
		System.out.println("The String is now converted to int: " + i );
		System.out.println("Add 1 to the converted strng " +(i+1));
		 s.close();
	}

}
