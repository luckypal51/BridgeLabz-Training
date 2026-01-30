package com.example.iostream.com.example.iostream.csv.jsontocsv;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class JsonToCsv {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

       
        List<Student> students = mapper.readValue(
                new File("file/student.json"),
                new TypeReference<List<Student>>() {}
        );

        CSVWriter writer = new CSVWriter(new FileWriter("file/example.csv"));

        // Header
        writer.writeNext(new String[]{"id", "name", "age"});

        // Data
        for (Student s : students) {
            writer.writeNext(new String[]{
                    String.valueOf(s.getId()),
                    s.getName(),
                    String.valueOf(s.getAge())
            });
        }

        writer.close();
        System.out.println("JSON converted to CSV successfully!");
    }
}
