package json.listtojson;

import java.util.ArrayList;

public class Student {
	public int rollno;
    public String name;
    public ArrayList<String> subject;
	public Student(int rollno, String name, ArrayList<String> subject) {
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + "]";
	}
    
    
}
