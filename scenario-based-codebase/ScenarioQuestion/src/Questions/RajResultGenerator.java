package Questions;
import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = 5;
        int[] marks = new int[subjects];
        int total = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; // repeat same subject
                continue;
            }

            total += marks[i];
        }

      
        double average = total / (double) subjects;
        System.out.println("Average Marks: " + average);

       
        int gradeCategory = (int) average / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }


    }
}
