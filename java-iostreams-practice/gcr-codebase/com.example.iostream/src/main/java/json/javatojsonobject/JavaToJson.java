package json.javatojsonobject;

import java.util.*;
import java.io.*;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Car c = new Car(4507545,"BMW");
		Car c2 = new Car(000001,"OMNI");
		Car c3 = new Car(741852,"HONDA");
		List<Car> list = new ArrayList<>();
		list.add(c3);
		list.add(c2);
		list.add(c);
		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File("file/cardetail.json"), list);
	}
}
