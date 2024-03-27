package com.hackathon.projects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q60ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,4,7,0,3,1,5,8, 4};
		reverse (arr);
	}

		 static void reverse(int[] arr) 
		    { 
			 for(int i=0;i<3;i++) {
		        Collections.reverse(Arrays.asList(arr)); 
		        System.out.println(Arrays.asList(arr)); 
			 }
			 for(int i=4;i<6;i++) {
			        Collections.reverse(Arrays.asList(arr)); 
			        System.out.println(Arrays.asList(arr)); 
				 }
			 for(int i=7;i<9;i++) {
			        Collections.reverse(Arrays.asList(arr)); 
			        System.out.println(Arrays.asList(arr)); 
				 }
		    }  
		      
}


