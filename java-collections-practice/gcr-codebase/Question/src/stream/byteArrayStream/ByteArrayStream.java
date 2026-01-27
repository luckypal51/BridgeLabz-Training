package stream.byteArrayStream;

import java.io.*;

public class ByteArrayStream {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("file/myphoto.jpg");
		 
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    
	    int n;
	    while((n=file.read())!=-1) {
	    	bytes.write(n);
	    }
	    byte [] arr = bytes.toByteArray();
	    
	    FileOutputStream out = new FileOutputStream("file/copy.jpg");
	    out.write(arr);
	    FileInputStream file2 = new FileInputStream("file/myphoto.jpg");
		 
	    ByteArrayOutputStream bytes2 = new ByteArrayOutputStream();
	    while((n=file2.read())!=-1) {
	    	bytes2.write(n);
	    }
	    byte [] arr2 = bytes2.toByteArray();
	    if(arr.equals(arr2)) {
	    	System.out.println("Both files are same");
	    }else {
	    	System.out.println("files are not same");
	    }
	}
}
