package stream.BufferedInputStream;

import java.io.*;

public class Main {
   public static void  main(String[] args)  throws Exception{
	   BufferedInputStream buffer = new BufferedInputStream(new FileInputStream("file/input.txt"));
	   BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("file/output.txt"));
	   int line;
	   buffer.mark(4);
	   long start = System.nanoTime();
	   while((line=buffer.read())!=-1) {
		   out.write(line);
	   }
	   long end = System.nanoTime();
	   System.out.println("Bufferd Input Stream time "+(end-start));
	   buffer.close();
	   out.close();
	    
	   FileInputStream file = new FileInputStream("file/input.txt");
	   FileOutputStream fileout = new FileOutputStream("file/output.txt");
	   
	    start = System.nanoTime();
	    while((line=file.read())!=-1) {
	    	fileout.write(line);
	    }
	   end = System.nanoTime();
	   System.out.println("File Input Stream Time "+(end-start));
   }
}
