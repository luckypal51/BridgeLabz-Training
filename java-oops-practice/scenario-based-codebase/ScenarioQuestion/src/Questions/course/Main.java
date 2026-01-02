package Questions.course;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Undergraduate("U101", "Alice");
        Student s2 = new Postgraduate("P201", "Bob", "Artificial Intelligence");

        
        Faculty profSmith = new Faculty("Dr. Smith");

        
        Enrollnment aliceCS = new Enrollnment(s1, "Computer Science");
        Enrollnment bobAI = new Enrollnment(s2, "Advanced AI");

        
        System.out.println("--- Grading Period ---");
        profSmith.gradeStudent(aliceCS, 95.0);
        profSmith.gradeStudent(bobAI, 88.0);

        System.out.println("\n--- Final Transcripts ---");
        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}
