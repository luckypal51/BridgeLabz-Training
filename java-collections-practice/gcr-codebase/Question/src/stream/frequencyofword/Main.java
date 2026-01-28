package stream.frequencyofword;

import java.io.*;
import java.util.HashMap;

public class Main {
	static HashMap<String, Integer> map = new HashMap<>();
	
    public static void main(String[] args) {
    
    	try(BufferedReader read = new BufferedReader(new FileReader("file/input.txt"))){
    		String line;
    		
    		while((line=read.readLine())!=null) {
    			count(line);
    		}
    		top();
    	}catch(IOException e) {
    		System.out.println(e.getMessage());
    	}
    }
    public static void count(String freq) {
    	freq = freq.toLowerCase();
    	String[] arr = freq.split("\\s+");
    	
    	for(String s: arr) {
    		if(map.containsKey(s)) {
    			map.put(s,map.get(s)+1);
    		}else {
    			map.put(s, 1);
    		}
    	}
    }
    
    public static void top() {
    	int perv= Integer.MAX_VALUE;
       for(int i = 0;i<5;i++) {
    	   int cur = Integer.MIN_VALUE;
    	   String s = "";
    	   for(var a:map.entrySet()) {
    		   if(a.getValue()>cur) {
    			   if(a.getValue()<perv) {
    				   cur = a.getValue();
    				   s = a.getKey();
    			   }
    		   }
    	   }
    	   perv = cur;
    	   System.out.println((i+1)+". "+s+" : "+cur);
       }
    }
}
