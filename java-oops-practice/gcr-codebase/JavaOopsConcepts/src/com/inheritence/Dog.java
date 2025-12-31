package com.inheritence;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
     @Override
    public void makeSound() {
       System.out.println(this.name+" Bhow bhow");
    }
}
