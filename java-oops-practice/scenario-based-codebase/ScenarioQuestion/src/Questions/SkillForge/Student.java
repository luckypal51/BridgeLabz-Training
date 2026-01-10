package Questions.SkillForge;

public class Student extends User implements ICertifiable {
    private int progress; 

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    
    public void updateProgress(int value) {
        progress += value;
        if (progress > 100) progress = 100;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100) {
            System.out.println("Certificate generated for student: " + name);
        } else {
            System.out.println("Course not completed yet.");
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}
