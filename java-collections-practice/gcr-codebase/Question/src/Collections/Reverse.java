package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reverse {
   public static void main(String[] args) {
	   ArrayList<Integer> arr1 =new ArrayList<>();
	   arr1.add(1);
	   arr1.add(5);
	   arr1.add(2);
	   arr1.add(9);
	   System.out.println("Before reverse : "+arr1);
	   reverseList(arr1);
	   System.out.println("After reverse  : "+arr1);
	   LinkedList<Integer> list = new LinkedList<>();
	   list.add(1);
	   list.add(5);
	   list.add(2);
	   list.add(9);
	   System.out.println("\nBefore reverse : "+list);
	   reverseLinkedList(list);
	   System.out.println("After reverse  : "+list);
   }
   public static void reverseList(ArrayList<Integer> arr) {
	   int start = 0;
	   int end = arr.size()-1;
	   while(start<end) {
		   int temp = arr.get(start);
		   arr.set(start,arr.get(end));
		   arr.set(end,temp);
		   start++;
		   end--;
	   }
   }
   public static void reverseLinkedList(LinkedList<Integer> list) {
	   LinkedList<Integer> arr = new LinkedList<>();
	    while(!list.isEmpty()) {
	    	Integer x = null;
	    	for(Integer a: list) {
	    		x = a;
	    	}
	    	list.pollLast();
	    	arr.add(x);
	    }
	    list.addAll(arr);
   }
}
