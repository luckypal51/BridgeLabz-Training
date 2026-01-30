package com.example.iostream.com.example.iostream.csv.dupilcate;

import java.io.*;
import java.util.*;

public class DuplicateCSV {
    public static void main(String[] args) throws Exception {

        String filePath = "file/student.csv";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        Set<String> ids = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String id = data[0];

            if (!ids.add(id)) { 
                duplicates.add(line);
            }
        }

        br.close();

        System.out.println("Duplicate Records:");
        for (String record : duplicates) {
            System.out.println(record);
        }
    }
}
