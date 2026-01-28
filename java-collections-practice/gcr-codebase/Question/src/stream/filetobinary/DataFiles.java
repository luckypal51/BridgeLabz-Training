package stream.filetobinary;

import java.io.*;
import java.util.ArrayList;

public class DataFiles {
	public static void main(String[] args) {
		try {
			 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			 ArrayList<Student> arr = new ArrayList<>();
			 System.out.println("Enter number of student : ");
			 int n = Integer.parseInt(buffer.readLine());
			 buffer.readLine();
			 while(n-->0) {
				 System.out.println("Enter the rollno : ");
				 int rollno = Integer.parseInt(buffer.readLine());
				 System.out.println("Enter the name   : ");
				 String name = buffer.readLine();
				 System.out.println("Enter the GPA    : ");
				 double gpa = Double.parseDouble(buffer.readLine());
				 arr.add(new Student(rollno,name,gpa));		 
			 }
			 
			DataOutputStream data = new DataOutputStream(new FileOutputStream("file/student.dat"));
			for(Student e: arr) {
				data.writeBytes(e.toString());
			}
			
			DataInputStream input = new DataInputStream(new FileInputStream("file/student.dat"));
			int l;
			while((l=input.read())!=-1) {
				System.out.print((char)l);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
