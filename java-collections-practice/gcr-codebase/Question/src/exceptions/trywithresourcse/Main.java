package exceptions.trywithresourcse;

import java.io.*;

public class Main {
  public static void main(String[] args) {
	   try(BufferedReader read = new BufferedReader(new FileReader("file/input.txt"))){
		   int i = 0;
		   String line;
		   while(((line=read.readLine())!=null)&&(i<1)) {
			   System.out.println(line);
			   i++;
		   }
			   
	   }catch(IOException e) {
		   System.out.println(e.getMessage());
	   }
  }
}
