package json.extractkeyandvalue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
public class ExtractKeyAndValue {
    public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectMapper map = new ObjectMapper();
		
		JsonNode node = map.readTree(new FileReader("file/student.json"));
		
		System.out.println(node);
	}
}
