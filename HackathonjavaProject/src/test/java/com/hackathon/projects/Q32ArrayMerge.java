package com.hackathon.projects;
//Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
//Write a method to merge B into A in sorted order. 

import java.util.Map;
import java.util.TreeMap;

public class Q32ArrayMerge {
	 static void mergeArrays(int a[], int b[], int n, int m) 
	 {
	 Map<Integer,Boolean> hm = new TreeMap<Integer,Boolean>();
	 for(int i = 0;i<=5;i++)
		hm.put(i, true);
		
		for(int j = 5;j<=10;j++)
		hm.put(j, true);
    // Printing keys of the map.
    for (Map.Entry<Integer,Boolean> me : hm.entrySet())
    {
        System.out.print(me.getKey() + " ");
    }
	 }
	public static void main(String[] args)throws Exception {
	
		int a[] = {1,2,3,4,5}, b[] = {6,7,8,9};
        int size = a.length;
        int size1 = b.length;
        mergeArrays(a, b, size, size1);
	}

}
