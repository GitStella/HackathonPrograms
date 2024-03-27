package com.hackathon.projects;

import java.util.Scanner;


public class Q17CountUPLow {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Value = str.nextLine();
		int countup = 0;
		int countlow = 0;
		int intcount= 0;
		for (int i=0; i<Value.length(); i++)
		{
		
			if (Character.isDigit(Value.charAt(i)))
				intcount = intcount+1;
			else if (Character.isUpperCase(Value.charAt(i)))
				countup = countup +1;
			else if (Character.isLowerCase(Value.charAt(i)))
				countlow = countlow +1;
			}
			System.out.println("No. Of Integers :" + intcount);	
			System.out.println("No. Of UpperCase :" + countup);	
			System.out.println("No. Of LowerCase :" + countlow);	
		}
	}


