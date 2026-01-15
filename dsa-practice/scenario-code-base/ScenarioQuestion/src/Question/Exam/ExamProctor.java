package Question.Exam;
import java.util.*;

class ExamProctor {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> answers;
    private HashMap<Integer, String> correctAnswers;

    public ExamProctor() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();

        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    
    public void navigateQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

  
    public void evaluateExam() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int qId = entry.getKey();
            String correct = entry.getValue();
            String studentAnswer = answers.get(qId);

            if (studentAnswer != null && studentAnswer.equalsIgnoreCase(correct)) {
                score++;
            }
        }

        System.out.println("Exam Submitted Successfully!");
        System.out.println("Final Score: " + score + "/" + correctAnswers.size());
    }

    
    public void reviewLastQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No question navigation history.");
            return;
        }
        System.out.println("Last visited question: " + navigationStack.peek());
    }
}
