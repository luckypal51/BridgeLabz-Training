package stream.pipedstream;

import java.io.PipedInputStream;


public class PipedThreadInput implements Runnable
{   PipedInputStream input;
    public PipedThreadInput(PipedInputStream input) {
	    this.input = input;
	}
	@Override
	public void run() {
		try {
   		 System.out.println(this.input.read());
   		    
   	}
	   catch(Exception e) {
		   System.out.println(e.toString());
	   }
	}
    
   
}
