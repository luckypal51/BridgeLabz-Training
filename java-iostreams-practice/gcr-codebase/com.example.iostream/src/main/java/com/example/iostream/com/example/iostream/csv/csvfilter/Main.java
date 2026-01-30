package com.example.iostream.com.example.iostream.csv.csvfilter;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.opencsv.CSVReader;

public class Main {
      public static void main(String[] args)throws Exception {
		CSVReader read = new CSVReader(new FileReader("file/input.csv"));
		BufferedWriter write = new BufferedWriter(new FileWriter("file/topper.csv"));
		String[] s;
		while((s=read.readNext())!=null) {
			double  perc = Double.parseDouble(s[2]);
			if(perc>=80) {
				write.write(s[0]+","+s[1]+","+s[2]);
				write.newLine();
				System.out.println("Added "+s[1]);
			}
		}
		read.close();
		write.close();
	}
}
