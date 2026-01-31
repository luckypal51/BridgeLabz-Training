package json.jsonobject;

import java.util.ArrayList;

public class Student {
   public  String name;
   public int age;
   public  ArrayList<String> subjects;
	
    public Student() {}
    public Student(String name, int age, ArrayList<String> subjects) {
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	} 
    
}
