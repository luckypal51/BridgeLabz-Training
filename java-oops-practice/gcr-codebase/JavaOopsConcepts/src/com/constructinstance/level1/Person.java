package com.constructinstance.level1;
import java.util.*;

public class Person {
      String name;
      int age;
     
      public Person(String name,int age) {
    	  this.name = name;
    	  this.age = age;
      }
      
      public Person(Person p) {
    	  this.name = p.name;
    	  this.age = p.age;
      }
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  String p1 = sc.nextLine();
    	  int age1 = sc.nextInt();
    	  
    	  Person p = new Person(p1,age1);
    	  System.out.println(p.name);
    	  System.out.println(p.age);
    	  
    	  Person p2 = new Person(p);
    	  System.out.println(p2.name);
    	  System.out.println(p2.age);
      }
}
