package Question.ArtExpo;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	Artist[] arr = {new Artist("Lucky",LocalTime.of(10,30)),new Artist("himesh",LocalTime.of(6,10)),new Artist("Nageshwar",LocalTime.of(21,30))};
    	System.out.println(Arrays.toString(insertion(arr)));
    }
    public static Artist[] insertion(Artist[] art) {
    	   int n = art.length;
           for (int i = 1; i < n; ++i) {
               Artist key = art[i];
               int j = i - 1;
               
               while (j >= 0 && art[j].time.isAfter(key.time)) {
                   art[j + 1] = art[j];
                   j = j - 1;
               }
               art[j + 1] = key;
           }
           return art;
    }
}
