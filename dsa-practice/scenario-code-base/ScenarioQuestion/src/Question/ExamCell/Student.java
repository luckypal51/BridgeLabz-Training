package Question.ExamCell;

public class Student {
      public String name;
      public double percentage;
      
      public Student(String name,double percentage) {
    	  this.name = name;
    	  this.percentage = percentage;
      }
      
      @Override
    public String toString() {
    	return "\n Name : "+this.name+"\n Percentage : "+this.percentage;
    }
}
