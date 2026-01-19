package Collections;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
    	HashMap<String,Integer> map = new HashMap<>();
    	String[] name = {"apple","banana","apple","mango","apple","banana"};
    	
    	for(String s:name) {
    		if(map.containsKey(s)) {
    			map.put(s,map.get(s)+1);
    		}else {
    			map.put(s, 1);
    		}
    	}
    	System.out.println(map);
    }
}
