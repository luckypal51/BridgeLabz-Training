package com.inheritence;

public class Bird extends Animal{

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
     @Override
    public void makeSound() {
       System.out.println(this.name+"chi chi chi");
    }
}
