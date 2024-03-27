package com.hackathon.projects;

import java.util.Scanner;
// Q2 -write a program to find factorial (Non Recursive)

public class Q2Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n;
		        int ans = 1;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the Factorial number:");
		        n = s.nextInt();
		        for(int i = 1; i <= n; i++)
		        {
		            ans = ans * i;
		        }
		        System.out.println("Factorial of "+n+" :"+ans);
		        s.close();
		    }
			
		}
	