package stream;

import java.io.*;

public class FileHandling {
	public static void main(String[] args)throws Exception {
		try{
		FileInputStream file = new FileInputStream("file/input.txt");
		FileOutputStream out = new FileOutputStream("file/output.txt");
		
		int n;//
		while((n=file.read())!=-1) {
			out.write(n);
//			System.out.println((char)n);
			System.out.println((char)file.read());
		}
		System.out.println("Successfully copied");
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("The process complete");
		}
	}
}
