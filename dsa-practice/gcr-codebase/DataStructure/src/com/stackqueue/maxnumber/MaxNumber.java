package com.stackqueue.maxnumber;

import java.util.*;

public class MaxNumber {
     public static void main(String[] args) {
    	int [] arr = {1,2,3,4,5,2,8,2};
    	int k = 3;
    	
    	System.out.println(max(arr,k));
     }
     public static ArrayList<Integer> max(int[] arr, int k) {
    	 ArrayList<Integer> ans = new ArrayList<>();
    	 Stack s = new Stack();
    	 
    	 for(int i =0;i<k;i++) {
    		 if(s.isEmpty()) {
    			 s.push(arr[i]);
    		 }else if(s.top.data<arr[i]) {
    			 s.pop();
    			 s.push(arr[i]);
    		 }
    	 }
    	 if(!s.isEmpty()) {
    		 ans.add(s.top.data);
    	 }
    	 for(int i = k;i<arr.length;i++) {
    		 if(s.top.data<arr[i]) {
    			 s.pop();
    			 s.push(arr[i]);
    		 }
    		 ans.add(s.top.data);
    	 }
    	 return ans;
     }
}
