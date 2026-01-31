package json.matchdata;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JsonProcessor {

    public static void processJson(String input, String output) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<Match> matches = mapper.readValue(
                new File(input),
                new TypeReference<List<Match>>() {}
        );

        for (Match m : matches) {
            CensorshipService.censorMatch(m);
        }

        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(output), matches);

        System.out.println("Censored JSON created: " + output);
    }
}
