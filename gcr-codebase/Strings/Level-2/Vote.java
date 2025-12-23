import java.util.*;

public class Vote{
    public static void main(String[] args) {

        int n = 10;

        int[] ages = generateAges(n);

        String[][] votingResult = checkVotingEligibility(ages);

       for(String[] a: votingResult){
		   System.out.println(Arrays.toString(a));
	   }
    }
  
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(89) + 10;
        }

        return ages;
    }

  
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

  
}
