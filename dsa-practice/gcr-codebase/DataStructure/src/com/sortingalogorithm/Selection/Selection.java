package com.sortingalogorithm.Selection;

import java.util.Arrays;

public class Selection {
     public static void main(String[] args) {
    	 int [] arr = {1,323,54,5,7};
    	 System.out.println(Arrays.toString(selection(arr)));
     }
     public static int[] selection(int [] arr) {
    	 int n = arr.length-1;
    	 for(int i =0;i<arr.length;i++) {
    		 int temp =0;
    		 for(int j=0;j<arr.length-i;j++) {
    			 if(arr[j]>arr[temp]) {
    				 temp = j;
    			 }
    		 }
    		 int swap = arr[temp];
    		 arr[temp]= arr[n-i];
    		 arr[n-i]= swap;
    	 }
    	 return arr;
     }
}
