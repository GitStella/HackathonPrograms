package com.hackathon.projects;

import java.util.Scanner;
//Q30. Write a function to find out longest palindrome in a given string?
public class Q30LongestPalindrome {

	
		private static String max_string = "";

	    public static void checkSubString(String s){
	     
	        for(int i=1;i<=s.length();i++){
	            StringBuilder s1 = new StringBuilder(s.substring(0,i));
	            StringBuilder s2 = new StringBuilder(s.substring(0,i));
	            s2.reverse();
	            if(s1.toString().equals(s2.toString())){
	                if(max_string.length()<=s1.length()){
	                    max_string = s1.toString();
	                 //   System.out.println("tmp max is "+max_string);
	                }

	            }
	        }
	    }

	    public static void main(String[] args){
	        String s="HABCDEDCBAGHTFYW1234567887654321ZWETYGDE";

	        for(int i=0; i<s.length(); i++)
	            checkSubString(s.substring(i, s.length()));

	        System.out.println("Longest Palindrome of the String is : "+max_string);
	    }
		
	}

