package com.stackqueue.Span;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	int [] arr = {100,80,60,70,60,75,85};
    	System.out.println(Arrays.toString(span(arr)));
    }
    public static int[] span(int[] arr) {
    	  int n = arr.length;
          int[] ans = new int[n];
          Stack s = new Stack(); // store indices

          for(int i = 0; i < n; i++) {

              while(!s.isEmpty() && arr[s.top()] <= arr[i]) {
                  s.pop();
              }

              ans[i] = s.isEmpty() ? (i + 1) : (i - s.top());

              s.push(i);
          }

          return ans;
    }
}
