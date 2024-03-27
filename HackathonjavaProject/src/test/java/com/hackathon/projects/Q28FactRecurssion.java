package com.hackathon.projects;
//Q28. WJP to find factorial of a number using recursion
import java.util.Scanner;

public class Q28FactRecurssion {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Factorial number:");
        n = s.nextInt();
		// int num = 6;
	        long factorial = factorialrecur(n);
	        System.out.println("Factorial of the number "+n+" is :" +factorial);
	    }
	    public static long factorialrecur(int n)
	    {
	        if (n >= 1)
	            return n * factorialrecur(n - 1);
	        else
	            return 1;
	}

}
