package com.constructinstance.level1;

public class BookLibrary {
	public int isbn;
	protected String title;
	private String author;
	
	public BookLibrary() {
		
	}
	public BookLibrary(int isbn,String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
}
