package com.example.iostream.com.example.iostream.csv.csvreadandcount;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ReadAndCount {
       public static void main(String[] args) throws Exception {
		CSVReader csv = new CSVReader(new FileReader("file/output.csv"));
		String[] s;
		int count = 0;
		csv.readNext();
		while((s=csv.readNext())!=null) {
			System.out.println(Arrays.toString(s));
			count++;
		}
		System.out.println("The number of lines : "+count);
	}
}
