package com.hackathon.projects;
//Q22. WJP to convert int to string
import java.util.Scanner;

public class Q22InttoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int num = s.nextInt();
		Integer i=Integer.valueOf(num);  
		
		System.out.println(i);
		System.out.println("Converted to string " + i+100);
		//System.out.println(s+100);
		s.close();
	}

}
