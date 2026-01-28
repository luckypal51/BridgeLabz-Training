package stream.filetobinary;

public class Student {
   private int rollno;
   private String name;
   private double gpa;
  
   public Student(int rollno, String name, double gpa) {
	
	this.rollno = rollno;
	this.name = name;
	this.gpa = gpa;
   }

   public int getRollno() {
	return rollno;
   }

   public void setRollno(int rollno) {
	this.rollno = rollno;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public double getGpa() {
	return gpa;
   }

   public void setGpa(double gpa) {
	this.gpa = gpa;
   }

   @Override
   public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", gpa=" + gpa + "]";
   }
   
}
