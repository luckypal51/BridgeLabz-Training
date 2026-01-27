package stream.console;

import java.io.*;

public class Main {
   public static void main(String[] args) {
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	    
	    try {
	    	FileWriter write = new FileWriter("file/get.txt");
	    	String name = read.readLine();
	    	write.write(name);
	    	read.close();
	    	write.close();
	    }catch(Exception e) {
	    	System.out.println(e.toString());
	    }
   }
}
