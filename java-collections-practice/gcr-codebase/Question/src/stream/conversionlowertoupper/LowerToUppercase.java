package stream.conversionlowertoupper;

import java.io.*;

public class LowerToUppercase {
	public static void main(String[] args) throws IOException {
		FileReader read = new FileReader("file/input.txt");
		FileWriter write = new FileWriter("file/output.txt");
		int n;
		while((n=read.read())!=-1) {
			if(n>=97&&n<=122) {
				n -= 32;
			}
			write.write(n);
		}
		read.close();
		write.close();
	}
}
