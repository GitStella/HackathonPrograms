package com.hackathon.projects;
//Q16. Write a method that will remove given character from the String?
import java.util.Scanner;

public class Q16RemoveChar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Value = str.nextLine();
		StringBuilder input = new StringBuilder(Value);
		StringBuilder output = new StringBuilder(input).deleteCharAt(5);
		System.out.println(output);
	}

}
