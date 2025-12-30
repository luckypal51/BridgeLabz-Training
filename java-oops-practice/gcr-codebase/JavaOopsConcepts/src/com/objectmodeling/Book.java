package com.objectmodeling;

public class Book {
	
       private String author;
       private String bookName;
       private float price;
       private boolean available = true;
	 
       
       public String getAuthor() {
		return author;
	}
	   public void setAuthor(String author) {
		   this.author = author;
	   }
	   public String getBookName() {
		   return bookName;
	   }
	   public void setBookName(String bookName) {
		   this.bookName = bookName;
	   }
	   public float getPrice() {
		   return price;
	   }
	   public void setPrice(float price) {
		   this.price = price;
	   }
	  public Book(String author, String bookName, float price) {
		this.author = author;
		this.bookName = bookName;
		this.price = price;
	   }
	  public boolean isAvailable() {
		  return available;
	  }
	  public void setAvailable(boolean available) {
		  this.available = available;
	  }
       
}
