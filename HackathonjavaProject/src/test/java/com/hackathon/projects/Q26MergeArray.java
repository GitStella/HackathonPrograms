package com.hackathon.projects;
//Q26. WJP to merge two sorted array.(Do not use third array)		array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8	
//After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Q26MergeArray {
		
	      	 static void mergeArrays(int a[], int b[], int n, int m) 
	    	    {
	    	       
	    	        // Declaring a map.
	    	        // using map as a inbuilt tool
	    	        // to store elements in sorted order.
	    	        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
	    	       
	    	        // Inserting values to a map.
	    	        for(int i = 0; i < n; i++)
	    	        {
	    	            mp.put(a[i], true);
	    	        }
	    	        for(int i = 0;i < m;i++)
	    	        {
	    	            mp.put(b[i], true);
	    	        }
	    	       
	    	        // Printing keys of the map.
	    	        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
	    	        {
	    	            System.out.print(me.getKey() + " ");
	    	        }
	    	    }
	    	     
	    	    // Driver Code
	    	    public static void main (String[] args) 
	    	    {
	    	        int a[] = {1,2,4,6,9,10}, b[] = {3, 5,7,8};
	    	        int size = a.length;
	    	        int size1 = b.length;
	           
	    	        // Function call
	    	        mergeArrays(a, b, size, size1);
	    	    }
	    }   
	 
	


