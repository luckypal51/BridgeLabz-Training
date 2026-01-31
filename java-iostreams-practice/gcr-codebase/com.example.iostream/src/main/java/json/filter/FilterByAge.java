package json.filter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.util.List;
public class FilterByAge {
    public static void main(String[] args) throws Exception{
		ObjectMapper map = new ObjectMapper();
		JsonNode node = map.readTree(new FileReader("file/student.json"));
		
		List<Student> list = map.readValue(node.toPrettyString(),new TypeReference<List<Student>>() {});
		
		list.stream().filter(x->x.age>=25).forEach(System.out::println);
	}
}
