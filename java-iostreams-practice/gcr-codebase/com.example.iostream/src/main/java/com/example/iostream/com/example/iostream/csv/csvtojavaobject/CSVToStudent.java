package com.example.iostream.com.example.iostream.csv.csvtojavaobject;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class CSVToStudent {
    public static void main(String[] args) throws Exception {

        CSVReader csv = new CSVReader(new FileReader("file/student.csv"));
        List<String[]> rows = csv.readAll();
        csv.close();

        List<Student> students = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) { 
            String[] row = rows.get(i);

            int id = Integer.parseInt(row[0]);
            String name = row[1];
            String email = row[2];
            String phone = row[3];

            Student s = new Student(id, name, email, phone);
            students.add(s);
        }
        students.forEach(System.out::println);
    }
}
