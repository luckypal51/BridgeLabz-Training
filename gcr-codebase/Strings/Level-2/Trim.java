import java.util.Scanner;
public class Trim {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

      
        int[] indexes = findTrimIndexes(input);
        String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

       
        String builtInTrimmed = input.trim();


        System.out.println("Custom Trimmed String : " + customTrimmed );
        System.out.println("Built-in Trimmed String: " + builtInTrimmed);
    }
   
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

   
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

 

}
