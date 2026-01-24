package com.tripplanner;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Process {
	HashMap<String,Integer>map = new HashMap<>();
	HashSet<String> set = new HashSet<>();
   public void insert(Trip trip) throws IOException {
	   FileOutputStream st = new FileOutputStream("File/output.txt");
	   ObjectOutputStream oout = new ObjectOutputStream(st);
	   
	    oout.writeObject(trip);
   }
   public void addTrip() throws Exception{
	   FileInputStream st = new FileInputStream("File/output.txt");
	   ObjectInputStream out = new ObjectInputStream(st);
	   Trip tr = (Trip)out.readObject();
	    if(map.containsKey(tr.getCity())) {
	    	map.put(tr.getCity(),map.get(tr.getCity())+1);
	    }else {
	    	map.put(tr.getCity(),1);
	    }
	   set.add(tr.getCountrie());
   }
   public void topCityVisited() {
	  String[] arr = new String[3];
	 
	  for(int i = 0;i<arr.length;i++) {
		  String s = "";
		  int val = 0;
		  for(var a : map.entrySet()) {
			  if(val<a.getValue()) {
				  if((i==1)&&(!a.getKey().equalsIgnoreCase(arr[i-1]))) {
					  s = a.getKey();
					  val = a.getValue();
				  }
				  if((i==2)&&(!a.getKey().equalsIgnoreCase(arr[i-1])&&(!a.getKey().equalsIgnoreCase(arr[i-2])))) {
					  s = a.getKey();
					  val = a.getValue();
				  }
				  if(i==0) {
					 s = a.getKey();
					 val = a.getValue();
				  }
			  }
		  }
		  arr[i] = s;
	  }
	  System.out.println("Top 3 visited City");
	  for(int i = 0;i<arr.length;i++) {
		  System.out.println((i+1)+". "+arr[i]);
	  }
   }
   public void country() {
	   System.out.println("\nCountries Visted :");
	  set.stream().forEach(System.out::println);
   }
}
