package Questions.FitTrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    
    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 5; 
        return caloriesBurned;
    }
}
