package com.hackathon.projects;

import java.util.Scanner;
//Q23. WJP to differentiate input as string, int or bool
public class Q23InputStrIntBool {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		
		
		if (s.hasNextInt())
		{
			int number = s.nextInt();
				System.out.println("Entered Input is a Integer " + number);
		}
		else if (s.hasNext() )
		{ 
			String str = s.nextLine();
			if ((str.contains("true"))|| (str.contains("false")))
			System.out.println("Entered Input is a Boolean "+ str);
			else 
			System.out.println("Entered Input is a String "+ str);
		}
			
		}
	}
	

