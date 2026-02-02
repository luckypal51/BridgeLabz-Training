package collectors.paragrapgh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Paragraph {
	public static void main(String[] args) {
		String para = "Lucky is the best person and best code also lucky stand for luck";
		

        Map<String, Integer> wordCount =
                Arrays.stream(para.split("\\s+"))
                      .map(String::toLowerCase)
                      .collect(Collectors.toMap(
                              word -> word,    
                              word -> 1,       
                              Integer::sum    
                      ));

        System.out.println(wordCount);
	}
}
