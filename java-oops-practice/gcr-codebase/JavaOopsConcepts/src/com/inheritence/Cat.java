package com.inheritence;

public class Cat extends Animal {
       public Cat(String name, int age) {
    	   super(name,age);
       }
       @Override
    public void makeSound() {
    	// TODO Auto-generated method stub
        System.out.println(this.name+" Meow Meow");
    }
}
