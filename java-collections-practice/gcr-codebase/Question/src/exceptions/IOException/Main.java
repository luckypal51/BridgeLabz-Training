package exceptions.IOException;
import java.io.*;
public class Main {
    public static void main(String[] args) {
    	try(BufferedReader read = new BufferedReader(new FileReader("file/input.txt"))){
    		
    		String line;
    		while((line= read.readLine())!=null) {
    			System.out.println(line);
    		}
    	}catch(IOException e) {
    		System.out.println("File Not Found");
    	}
    }
}
