package collectors.result;

public class Student {
      public int id;
      public String name;
      public Grade grade;
	 
      public Student(int id, String name, Grade grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	  }

	  @Override
	  public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	  }
      
      
}
