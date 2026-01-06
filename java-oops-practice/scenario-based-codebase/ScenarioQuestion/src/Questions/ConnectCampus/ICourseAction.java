package Questions.ConnectCampus;

public interface ICourseAction {
    public void enrollCourse(String courseName,int courseId);
    
    public void dropCourse(int courseId);
}
