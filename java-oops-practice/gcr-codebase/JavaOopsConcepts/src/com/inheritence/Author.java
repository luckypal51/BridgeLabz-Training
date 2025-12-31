package com.inheritence;

public class Author extends Book {
	String name;
    String bio;
       public Author(String title, String publicationYear,String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	   
   @Override
   public void displayInfo() {
	// TODO Auto-generated method stub
	super.displayInfo();
	System.out.println("Author          : "+this.name);
	System.out.println("Bio             : "+this.bio);
   }    
}
