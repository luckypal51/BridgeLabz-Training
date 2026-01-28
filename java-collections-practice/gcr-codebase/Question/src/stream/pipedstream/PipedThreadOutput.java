package stream.pipedstream;

import java.io.PipedOutputStream;

public class PipedThreadOutput implements Runnable{
     PipedOutputStream output;
     
     public PipedThreadOutput(PipedOutputStream output) {
    	 this.output = output;
     }

	 @Override
	 public void run() {
		 try {
    		 int i = 100;
             while(i-->0) {
           	  output.write(i%26);
             }
    	 }catch(Exception e) {
    		 System.out.println(e.toString());
    	 }
	 }
     
    
}
