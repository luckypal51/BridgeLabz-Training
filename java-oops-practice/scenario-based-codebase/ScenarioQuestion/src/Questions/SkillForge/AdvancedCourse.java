package Questions.SkillForge;

public class AdvancedCourse extends Course implements ICertifiable {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Level Professional Certificate Issued");
    }
}
