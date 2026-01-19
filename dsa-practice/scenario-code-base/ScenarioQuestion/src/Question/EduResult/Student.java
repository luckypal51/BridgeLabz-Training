package Question.EduResult;

public class Student {
     public String name;
     public double percentage;
     
     public Student(String name, double percentage) {
    	 this.name = name;
    	 this.percentage = percentage;
     }
     
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\nStudent Name : "+this.name+" | Percenateg : "+this.percentage;
    }
}
