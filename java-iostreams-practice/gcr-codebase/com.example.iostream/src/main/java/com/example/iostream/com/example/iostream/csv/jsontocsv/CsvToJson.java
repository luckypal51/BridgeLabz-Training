package com.example.iostream.com.example.iostream.csv.jsontocsv;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("file/example.csv"));

        List<Student> students = new ArrayList<>();

        String[] line;
        reader.readNext(); 
        while ((line = reader.readNext()) != null) {
            int id = Integer.parseInt(line[0]);
            String name = line[1];
            int age = Integer.parseInt(line[2]);
            students.add(new Student(id, name, age));
        }
        reader.close();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new FileWriter("file/students_new.json"), students);

        System.out.println("CSV converted to JSON successfully!");
    }
}
