package Questions.SkillForge;

import java.util.*;

public class Course {
    private String title;
    private Instructor instructor;
    private double rating;               
    private List<String> modules;
    protected final List<String> reviews; 

   
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

  
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new ArrayList<>();
    }

   
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = newRating;
        }
    }

    public double getRating() {
        return rating;
    }

   
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }
}
