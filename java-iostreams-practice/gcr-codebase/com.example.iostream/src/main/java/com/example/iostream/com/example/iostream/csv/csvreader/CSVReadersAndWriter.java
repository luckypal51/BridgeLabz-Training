package com.example.iostream.com.example.iostream.csv.csvreader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVReadersAndWriter {
    public static void main(String[] args) throws Exception{
		CSVReader read = new CSVReader(new FileReader("file/input.csv"));
		String[] readline;
		while((readline= read.readNext())!=null) {
	       System.out.println(Arrays.toString(readline));		
		}
	}
}
