package com.example.iostream.com.example.iostream.csv.sorted;

import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class SortBySalary {
    public static void main(String[] args)throws Exception {
    	CSVReader csv = new CSVReader(new FileReader("file/output.csv"));
    	List<String[]> s = new ArrayList<>();
    	csv.readNext();
    	s = csv.readAll();
    	csv.close();
    	CSVWriter write = new CSVWriter(new FileWriter("file/output3.csv"));
    	s.stream().sorted((String[]a,String[]b)->Double.compare(Double.parseDouble(b[3]),Double.parseDouble(a[3]))).limit(5).forEach(x->write.writeNext(x));
    
    	write.close();
    }
}
