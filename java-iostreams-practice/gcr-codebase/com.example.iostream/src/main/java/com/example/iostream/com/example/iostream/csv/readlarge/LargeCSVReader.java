package com.example.iostream.com.example.iostream.csv.readlarge;

import java.io.BufferedReader;
import java.io.FileReader;

public class LargeCSVReader {
    public static void main(String[] args) throws Exception {

        String filePath = "file/merged_students.csv";
        int batchSize = 100; 

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        int count = 0;
        int totalRecords = 0;

      
        br.readLine();

        while ((line = br.readLine()) != null) {
            count++;
            totalRecords++;

            if (count == batchSize) {
                System.out.println("Processed records: " + totalRecords);
                count = 0; 
            }
        }

        if (count > 0) {
            System.out.println("Processed records: " + totalRecords);
        }

        br.close();
    }
}
