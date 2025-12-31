package com.inheritence;

public class Person {
      String name;
      int age;
	  public Person(String name, int age) {
		this.name = name;
		this.age = age;
	  }
      
	  public void personDetail() {
		  System.out.println(" ");
		  System.out.println("---------Person Details----------");
		  System.out.println("Name        : "+this.name);
		  System.out.println("Age         : "+this.age);
	  }
}
