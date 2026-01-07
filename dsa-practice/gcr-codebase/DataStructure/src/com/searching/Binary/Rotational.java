package com.searching.Binary;

public class Rotational {
	public static void main(String[] args) {
		int [] arr = {4,5,6,0,1,2,3};
		
		System.out.println(findRotationPoint(arr));
	}
	 public static int findRotationPoint(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] > arr[right]) {
	                left = mid + 1;
	            }
	           
	            else {
	                right = mid;
	            }
	        }
	        return left;
	    }

}
