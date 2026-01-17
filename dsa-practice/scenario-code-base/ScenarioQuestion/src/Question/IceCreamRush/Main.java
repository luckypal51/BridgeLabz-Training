package Question.IceCreamRush;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		IceCreamFlavour[] arr = {new IceCreamFlavour("Chocolate",5),new IceCreamFlavour("Vinella",25),new IceCreamFlavour("MangoDolly",15),new IceCreamFlavour("Chocolava",20)};
	    System.out.println(Arrays.toString(insertion(arr)));
	}
	public static IceCreamFlavour[] insertion(IceCreamFlavour[]arr) {
		   int n = arr.length;
           for (int i = 1; i < n; ++i) {
               IceCreamFlavour key = arr[i];
               int j = i - 1;
               
               while (j >= 0 && arr[j].sold>key.sold) {
                   arr[j + 1] = arr[j];
                   j = j - 1;
               }
               arr[j + 1] = key;
           }
           return arr;
	}
}
