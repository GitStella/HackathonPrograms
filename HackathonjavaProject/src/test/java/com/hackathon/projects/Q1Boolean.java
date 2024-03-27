package com.hackathon.projects;

// Q1 - Consider there is a 3 Boolean variable called a, b, c. 
//Check if at least two out of three Booleans are true 
import java.lang.String;
import java.util.Scanner;

public class Q1Boolean {

		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			 Scanner scanner = new Scanner(System.in);
		
		boolean a = scanner.nextBoolean();
		boolean b = scanner.nextBoolean();
		boolean c = scanner.nextBoolean();
		
			    if (a || (b && c)) {
			      System.out.println("At least two of the three Booleans are true.");
			    } else {
			      System.out.println("At most one of the three Booleans is true.");
			    }
			  scanner.close();
		}
		
	}

