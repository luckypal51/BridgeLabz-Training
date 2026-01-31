package json.matchdata;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class CsvProcessor {

    public static void processCsv(String input, String output) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(input));
        List<String[]> data = reader.readAll();
        reader.close();

        for (int i = 1; i < data.size(); i++) { 
            String[] row = data.get(i);
            row[1] = CensorshipService.maskTeam(row[1]); 
            row[2] = CensorshipService.maskTeam(row[2]);
            row[3] = CensorshipService.maskTeam(row[3]); 
            row[4] = "REDACTED";
        }

        CSVWriter writer = new CSVWriter(new FileWriter(output));
        writer.writeAll(data);
        writer.close();

        System.out.println("Censored CSV created: " + output);
    }
}
