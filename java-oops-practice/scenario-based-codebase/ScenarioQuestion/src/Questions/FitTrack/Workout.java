package Questions.FitTrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;
    protected int caloriesBurned;

    
    private String workoutLog;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.workoutLog = "Workout Started";
    }

   
    public abstract int calculateCalories();

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
        workoutLog = "Workout Completed";
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
