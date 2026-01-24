package com.resumeanalyzer;

public class Resume {
   public static void main(String[] args) throws Exception {
	   Process main= new Process();
	   main.file("file/resume2.txt");
	   main.file("file/resume.txt");
	   main.view();
   }
}
