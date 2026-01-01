package com.encapsulation.LibrarySystem;

import java.util.ArrayList;

public class Main {
	  public static void main(String[] args) {

	        ArrayList<LibraryItem> items = new ArrayList<>();

	        items.add(new Book(1, "Java Programming", "James Gosling"));
	        items.add(new Magazine(2, "Tech Today", "Editorial Team"));
	        items.add(new DVD(3, "Inception", "Christopher Nolan"));

	        LibraryService.manageItems(items);

	   
	        Reservable book = (Reservable) items.get(0);
	        book.reserveItem("Rahul");
	    }
}
