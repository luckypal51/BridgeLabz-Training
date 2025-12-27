package com.constructinstance.level1;

public class EBook extends BookLibrary{
	public EBook() {
		super(123,"sdfghjk","sdfghj");
	}
    public static void main(String[] args) {
    	BookLibrary b = new BookLibrary(12345,"lucky","lucky");
    	EBook book = new EBook();
        System.out.println(b.getAuthor());
        b.setAuthor("Rocky");
        System.out.println(b.getAuthor());
    }
}
