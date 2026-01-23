package Tree.studentManagementSystem;

public class Student {
     private int rollno;
     private String name;
     private double percentage;
     private Student right;
     private Student left;
     
	 public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.right = null;
		this.left = null;
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

	 public double getPercentage() {
		 return percentage;
	 }

	 public void setPercentage(double percentage) {
		 this.percentage = percentage;
	 }

	 public Student getRight() {
		 return right;
	 }

	 public void setRight(Student right) {
		 this.right = right;
	 }

	 public Student getLeft() {
		 return left;
	 }

	 public void setLeft(Student left) {
		 this.left = left;
	 }
     
   @Override
    public String toString() {
	
	return "\nStudent Name   : "+this.name+
		   "\nStudent RollNo : "+this.rollno+
		   "\nPercentage     : "+this.percentage;
   }  
}
