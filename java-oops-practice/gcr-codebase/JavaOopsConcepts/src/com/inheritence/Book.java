package com.inheritence;

public class Book {
      String title;
      String publicationYear;
	
      public Book(String title, String publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	  }
      
      public void displayInfo() {
    	  System.out.println(" ");
    	  System.out.println("----------Book Details---------------");
    	  System.out.println("title           : "+this.title);
    	  System.out.println("publicationYear : "+this.publicationYear);
      }
}
