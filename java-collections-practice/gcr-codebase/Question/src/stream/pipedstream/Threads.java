package stream.pipedstream;


import java.io.*;

public class Threads {
   public static void main(String[] args) throws Exception{
	   PipedOutputStream output = new PipedOutputStream();
	   PipedInputStream input = new PipedInputStream();
	   input.connect(output);
	   PipedThreadInput runableinput = new PipedThreadInput(input);
	   PipedThreadOutput runableoutput = new PipedThreadOutput(output);
	   Thread t1 = new Thread(runableinput);
	   Thread t2 = new Thread(runableoutput);
	   
	   t2.start();
	   t1.start();
	   
   }

   
}
