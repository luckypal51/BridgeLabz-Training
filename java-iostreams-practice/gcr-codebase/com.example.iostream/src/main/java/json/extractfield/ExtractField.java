package json.extractfield;

import java.util.List;
import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractField {
	public static void main(String[] args)throws Exception {
		ObjectMapper map = new ObjectMapper();
		
		JsonNode list = map.readTree(new File("file/cardetail.json"));
		
		for(JsonNode a:list) {
			
			System.out.println(a.toString());
		}
	}
}
