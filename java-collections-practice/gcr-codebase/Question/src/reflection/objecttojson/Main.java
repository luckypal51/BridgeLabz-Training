package reflection.objecttojson;

import java.util.HashMap;
import java.util.Map;

public class Main {
	 public static void main(String[] args) throws Exception {

	        Map<String, Object> data = new HashMap<>();
	        data.put("name", "Lucky");
	        data.put("age", 21);
	        data.put("gpa", 9.5);

	        Student s = ObjectMapper.toObject(Student.class, data);

	        s.show();
	    }
}
