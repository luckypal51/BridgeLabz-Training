package com.sortingalogorithm.merge;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
	   int[] arr = {5,4,3,4,433,554,22,1,0,0,6,55,4,4,3,22,62,1};
	   System.out.println(Arrays.toString(divide(arr,0,arr.length-1)));
	}
	public static int[] divide(int[] arr,int start,int end) {
		if(start==end) {
			return new int[] {arr[start]};
		}
		int mid = (end+start)/2;
		int [] arr1 = divide(arr,start,mid);
		int [] arr2 = divide(arr,mid+1,end);
		return merge(arr1,arr2);
	}
	
	public static int[] merge(int[] arr1,int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int [] ans = new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k++] = arr1[i++];
			}else {
				ans[k++] = arr2[j++];
			}
		}
		while(i<arr1.length) {
			ans[k++] = arr1[i++]; 
		}
		while(j<arr2.length) {
			ans[k++] = arr2[j++]; 
		}
		return ans;
	}
}
