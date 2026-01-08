package com.searching.Binary;

public class SearchTarget {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		System.out.println("Index Value of Target is "+binary(arr,6));
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
}
