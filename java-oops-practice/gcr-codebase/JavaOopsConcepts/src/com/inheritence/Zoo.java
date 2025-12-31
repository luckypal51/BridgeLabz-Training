package com.inheritence;

public class Zoo {
     public static void main(String[] args) {
    	 Animal an = new Animal("Dianosaur",1000);
    	 Bird db = new Bird("Koyal",5);
    	 Cat c = new Cat("Mewe",7);
    	 Dog d = new Dog("Sehru",10);
    	 an.makeSound();
    	 db.makeSound();
    	 c.makeSound();
    	 d.makeSound();
     }
}
