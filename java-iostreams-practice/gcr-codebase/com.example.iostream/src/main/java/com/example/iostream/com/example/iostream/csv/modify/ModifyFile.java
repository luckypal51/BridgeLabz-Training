package com.example.iostream.com.example.iostream.csv.modify;


import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ModifyFile {
    public static void main(String[] args) throws Exception{
		CSVReader csv = new CSVReader(new FileReader("file/output.csv"));
		List<String[]> list = new ArrayList<>() ;
	    list = csv.readAll();
	    csv.close();
	    for(String[] s: list) {
	    	if(s[2].equalsIgnoreCase("It")) {
	    		double salary = Double.parseDouble(s[3]);
	    		salary += salary/10;
	    		s[3] = String.valueOf(salary);
	    	}
	    }
	    CSVWriter write = new CSVWriter(new FileWriter("file/output.csv"));
	    write.writeAll(list);
	    write.close();

	    System.out.println("CSV file updated successfully!");
	}
}
