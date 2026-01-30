package com.example.iostream.com.example.iostream.csv.csvwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Main {
     public static void main(String[] args) throws Exception {
		BufferedWriter csv = new BufferedWriter(new FileWriter("file/output.csv"));
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		  int n = Integer.parseInt(read.readLine());
		  csv.write("Id,Name,Department,Salary");
	        csv.newLine();
		while(n-->0) {
			System.out.println("Enter the employee Id    :");
			int id = Integer.parseInt(read.readLine());
			System.out.println("Enter the employee Name  :");
			String name = read.readLine();
			System.out.println("Enter the department Name:");
			String dept = read.readLine();
			System.out.println("Enter the salary         :");
			double salary = Double.parseDouble(read.readLine());
			
			Employee emp = new Employee(id, name, dept, salary);
			csv.write(emp.toString());
			csv.newLine(); 
		}
		csv.close();
	}
}
