package collectors.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
	    student.add(new Student(101,"Lucky",Grade.A));
	    student.add(new Student(102,"Nageshwae",Grade.B));
	    student.add(new Student(103,"Himesh",Grade.D));
	    student.add(new Student(104,"Arvind",Grade.B));
	    
	    Map<Grade, List<Student>> map = student.stream().collect(Collectors.groupingBy(s->s.grade));
	    for(var a:map.entrySet()) {
	    	System.out.println(a.getKey()+" : "+a.getValue());
	    }
	}
}
