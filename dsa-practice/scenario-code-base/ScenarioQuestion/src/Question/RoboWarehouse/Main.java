package Question.RoboWarehouse;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
	   Package [] arr = {new Package(101,59.0),new Package(102,15.0),new Package(103,18.5),new Package(104,70.0),new Package(105,14.5)};
	   System.out.print(Arrays.toString(insertionSort(arr)));
   }
   public static Package[] insertionSort(Package[] arr) {
	   int n = arr.length;
       for (int i = 1; i < n; ++i) {
           Package key = arr[i];
           int j = i - 1;
           
           while (j >= 0 && arr[j].weight > key.weight) {
               arr[j + 1] = arr[j];
               j = j - 1;
           }
           arr[j + 1] = key;
       }
       return arr;
   }
}
