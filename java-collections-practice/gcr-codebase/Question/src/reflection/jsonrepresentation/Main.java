package reflection.jsonrepresentation;

public class Main {
	 public static void main(String[] args) throws Exception {

	        Student s = new Student("Lucky", 21, 9.5);

	        String json = JsonMapper.toJson(s);

	        System.out.println(json);
	    }
}
