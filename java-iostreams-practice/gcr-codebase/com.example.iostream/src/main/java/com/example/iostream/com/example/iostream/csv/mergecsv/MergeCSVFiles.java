package com.example.iostream.com.example.iostream.csv.mergecsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class MergeCSVFiles {

    public static void main(String[] args) throws Exception {

        Map<String, String[]> map = new LinkedHashMap<>();

        CSVReader reader1 = new CSVReader(new FileReader("file/student1.csv"));
        List<String[]> list1 = reader1.readAll();
        reader1.close();

        for (int i = 1; i < list1.size(); i++) { 
            String[] row = list1.get(i);
            String id = row[0];
            map.put(id, new String[]{id, row[1], row[2], "NA", "NA"});
        }

        CSVReader reader2 = new CSVReader(new FileReader("file/student2.csv"));
        List<String[]> list2 = reader2.readAll();
        reader2.close();

        for (int i = 1; i < list2.size(); i++) { 
            String[] row = list2.get(i);
            String id = row[0];

            if (map.containsKey(id)) {
                String[] existing = map.get(id);
                existing[3] = row[1]; 
                existing[4] = row[2]; 
            } else {
                map.put(id, new String[]{id, "NA", "NA", row[1], row[2]});
            }
        }

        
        CSVWriter writer = new CSVWriter(new FileWriter("file/merged_students.csv"));
        writer.writeNext(new String[]{"id", "name", "age", "marks", "grade"});

        for (String[] mergedRow : map.values()) {
            writer.writeNext(mergedRow);
        }

        writer.close();

        System.out.println("CSV files merged successfully!");
    }
}
