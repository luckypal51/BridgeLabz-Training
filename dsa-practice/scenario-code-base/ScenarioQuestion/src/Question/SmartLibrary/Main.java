package Question.SmartLibrary;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
	   Book[] arr = {new Book("Lost world",101),new Book("Art gallery",102)};
	   System.out.println(Arrays.toString(insertion(arr)));
   }
   public static Book[] insertion(Book[] arr) {
	   for(int i = 0;i<arr.length;i++) {
		   Book key = arr[i];
		   int j = i-1;
		   
		   while(j>=0&&key.name.compareToIgnoreCase(arr[j].name)<0) {
			   arr[j+1] = arr[j];
		      j--;
		   }
		   arr[j+1] = key;
	   }
	   
	   return arr;
   }
}
