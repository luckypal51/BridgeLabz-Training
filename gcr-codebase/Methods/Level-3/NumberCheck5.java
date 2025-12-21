import java.util.*;
public class NumberCheck5 {
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();

         System.out.println("Number: " + num);
         System.out.println("Perfect? " + isPerfect(num));
         System.out.println("Abundant? " + isAbundant(num));
         System.out.println("Deficient? " + isDeficient(num));
         System.out.println("Strong Number? " + isStrongNumber(num)); 
    }
    public static boolean isPerfect(int n) {
        if (n < 2) return false; 
        int sum = 1; 

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

  
    public static boolean isAbundant(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum > n;
    }

  
    public static boolean isDeficient(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

   
    public static boolean isStrongNumber(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    private static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

   
}
