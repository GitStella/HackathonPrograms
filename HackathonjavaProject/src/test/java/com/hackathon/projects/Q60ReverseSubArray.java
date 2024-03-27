package com.hackathon.projects;

public class Q60ReverseSubArray {

	public static void reversearray( int[] arr, int k)
	{
		int len = arr.length;
		for (int i=0; i<len;i=i+k)
		{
			int start = i;
			int end = Math.min(i+k-1, len-1);
			while (start<= end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,2,4,7,0,3,1,5,8, 4};
		int k = 3;
		
		reversearray (arr, k);
		System.out.println("Reversed sub array:");
		for(int val:arr) {
			System.out.println(val + " ");
		}
		
		
	}

}
