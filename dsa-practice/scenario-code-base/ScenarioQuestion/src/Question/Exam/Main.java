package Question.Exam;

public class Main {
	 public static void main(String[] args) {

	        ExamProctor exam = new ExamProctor();

	        exam.navigateQuestion(1);
	        exam.submitAnswer(1, "A");

	        exam.navigateQuestion(2);
	        exam.submitAnswer(2, "C");

	        exam.navigateQuestion(3);
	        exam.submitAnswer(3, "C");

	        exam.reviewLastQuestion();

	        exam.evaluateExam();
	    }
}
