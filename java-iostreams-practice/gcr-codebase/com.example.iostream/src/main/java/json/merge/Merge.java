package json.merge;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Merge {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	  ObjectMapper mapper = new ObjectMapper();

      String json1 = "{\"id\":101,\"name\":\"Lucky\"}";
      String json2 = "{\"age\":21,\"city\":\"Bhopal\"}";

      ObjectNode node1 = (ObjectNode) mapper.readTree(json1);
      ObjectNode node2 = (ObjectNode) mapper.readTree(json2);

      node1.setAll(node2);

      System.out.println(node1.toPrettyString());
      }
}
