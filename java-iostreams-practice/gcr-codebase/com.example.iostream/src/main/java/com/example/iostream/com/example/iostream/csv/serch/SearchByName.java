package com.example.iostream.com.example.iostream.csv.serch;

import java.io.*;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class SearchByName {
    public static void main(String[] args) throws Exception{
    	CSVReader csv = new CSVReader(new FileReader("file/output.csv"));
    	String[] s;
    	csv.readNext();
    	while((s=csv.readNext())!=null) {
    		String name = s[1];
    		if(name.equalsIgnoreCase("Lucky")) {
    			System.out.println(Arrays.toString(s));
    		}
    	}
    csv.close();	
    }
}
