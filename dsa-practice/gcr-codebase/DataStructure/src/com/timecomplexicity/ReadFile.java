package com.timecomplexicity;
import java.io.*;


public class ReadFile {

	public static void main(String[] args){
		try {
			FileReader file = new FileReader("File/Name.txt");
			
			
			BufferedReader reader = new BufferedReader(file);
			
			System.out.println("We are going to read file 'Name.txt' line by line\n");
			String line;
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
			reader.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}