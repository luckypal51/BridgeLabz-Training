package com.objectmodeling.level2;

import java.util.ArrayList;

public class Teacher {
	    ArrayList<Student> arr = new ArrayList<>();
	
        private String name;
        private int empId;
        
        
        public Teacher(String name, int empId) {
			this.name = name;
			this.empId = empId;
		}

		public void addStudent(String name, int rollno) {
        	arr.add(new Student(name,rollno));
        }
        
        public void addSubject(String name, float marks, int rollno) {
        	for(Student s: arr) {
        		if(s.getRollno()==rollno) {
        			s.addSubject(name, marks);
        			System.out.println("The marks and subject add !");
        			return;
        		}
        	}
        	System.out.println("The student does found");
        }
        public void getStudentsDetails() {
        	for(Student s: arr) {
        		s.studentDetail();
        	}
        }
        
}
