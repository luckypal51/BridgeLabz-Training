package com.timecomplexicity;

import java.util.Scanner;

public class Searching {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the dataset length:");
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i =0;i<n;i++)
	   {
		   arr[i] = i+1;
	   }
		   System.out.println("Enter target to Search  :");
	   
	   int target = sc.nextInt();
	   
	   long start = System.nanoTime();
	   int index = binary(arr,target);
	   long end = System.nanoTime();
	   System.out.println("Binary search time : "+(end-start));
	   
	   start = System.nanoTime();
	    index = linear(arr,target);
	    end = System.nanoTime();
	   System.out.println("linear search time : "+(end-start));
	   
   }
   public static int binary(int[] arr,int target) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(target<mid) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
   public static int linear(int[] arr, int target) {
	   for(int i =0;i<arr.length;i++) {
		   if(arr[i]==target) {
			   return i;
		   }
	   }
	   return -1;
   }
}
