package com.timecomplexicity;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		System.out.println("Enter the dataset length :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[n];
		int [] arr3 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[n-i-1] = i+1;
			arr2[n-i-1] = i+1;
			arr3[n-i-1] = i+1;
		}
		long start = System.nanoTime();
		bubble(arr1);
		long end = System.nanoTime();
		System.out.println("Bubble sort Time :"+(end-start));
		
		start = System.nanoTime();
		quickSort(arr1,0,n-1);
		 end = System.nanoTime();
		System.out.println("quick sort Time :"+(end-start));
		
		start = System.nanoTime();
		divide(arr1,0,n-1);
		 end = System.nanoTime();
		System.out.println("merge sort Time :"+(end-start));
	}
	public static int[] bubble(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);   
	            quickSort(arr, pivotIndex + 1, high); 
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high]; 
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	               
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
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
