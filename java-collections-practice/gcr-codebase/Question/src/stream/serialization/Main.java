package stream.serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	List<Employee> list = new ArrayList<>();
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	try {
    		System.out.println("Enter no of employee : ");
    		int n = Integer.parseInt(read.readLine());
    		read.readLine();
    		while(n-->0) {
    			System.out.println("Enter Id    :");
    			int id  = read.read();
    			read.readLine();
    			System.out.println("Enter name  :");
    			String name = read.readLine();
    			System.out.println("Enter dept  :");
    			String dept = read.readLine();
    			System.out.println("Enter salary:");
    			double salary = Double.parseDouble(read.readLine());
    			Employee emp = new Employee(id,name,dept,salary);
    			list.add(emp);
    		}
    		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file/employee.txt"));
    		out.writeObject(list);
    		
    		ObjectInputStream input = new ObjectInputStream(new FileInputStream("file/employee.txt"));
    		   @SuppressWarnings("unchecked")
			   List<Employee> empList = (List<Employee>) input.readObject();
               input.close();

               System.out.println("\n---- Employees from File ----");
               for (Employee e : empList) {
                   System.out.println(e);
               }
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
