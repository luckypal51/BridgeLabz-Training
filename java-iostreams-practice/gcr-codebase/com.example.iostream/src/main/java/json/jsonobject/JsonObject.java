package json.jsonobject;

import java.util.ArrayList;
import java.io.*;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObject {
    public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	    ArrayList<String> subject = new ArrayList<>();
	    subject.add("Hindi");
	    subject.add("English");
	    subject.add("Science");
	    Student stu = new Student("Lucky",21,subject);
	    ObjectMapper map = new ObjectMapper();
	    map.writeValue(new File("file/studentwithsubject.json"), stu);
	    
	}
}
