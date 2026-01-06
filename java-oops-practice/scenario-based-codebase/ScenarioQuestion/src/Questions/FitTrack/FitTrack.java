package Questions.FitTrack;

public class FitTrack {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Lucky",22,68.5,"Lose Weight");

        user.showProfile();

        Workout workout1 = new CardioWorkout(30);
        int burned = workout1.calculateCalories();
        workout1.stopWorkout();

        int dailyTarget = 500;
        int remaining = FitnessProgress.calculateRemainingCalories(
                dailyTarget,
                burned
        );

        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Calories Target: " + remaining);
    }
}
