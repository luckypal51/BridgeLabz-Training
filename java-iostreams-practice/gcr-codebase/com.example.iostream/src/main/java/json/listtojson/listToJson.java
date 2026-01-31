package json.listtojson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.*;

public class listToJson {

	    public static void main(String[] args) throws Exception {
	     List<Student> student = new ArrayList<>();
	     Student s1 = new Student(101,"Lucky",new ArrayList<>(Arrays.asList("Hindi","English","Science")));
	     Student s2 = new Student(102,"Himesh",new ArrayList<>(Arrays.asList("Hindi","English","Social Science")));
	     Student s3 = new Student(103,"Nageshwar",new ArrayList<>(Arrays.asList("Hindi","English","Environment Science")));
	     student.add(s1);
	     student.add(s2);
	     student.add(s3);
	    ObjectMapper map = new ObjectMapper();
	    String result = map.writeValueAsString(student);
	    
	    System.out.println(result);
	 
	}

}
