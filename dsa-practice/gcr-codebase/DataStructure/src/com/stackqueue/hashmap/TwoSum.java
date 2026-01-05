package com.stackqueue.hashmap;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {1,2,4,2,5,1,8,7,5,3,3};
		int sum = 6;
		pair(arr,sum);
	}
	public static void pair(int[] arr, int sum) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int a: arr) {
			if(map.containsKey(sum-a)) {
				System.out.println("The pair are "+a+" | "+(sum-a));
				map.put(a,sum-a);
			}else {
				map.put(a,sum-a);
			}
		}
	}
}
