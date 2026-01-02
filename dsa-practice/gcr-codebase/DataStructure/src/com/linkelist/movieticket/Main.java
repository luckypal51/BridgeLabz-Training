package com.linkelist.movieticket;

public class Main {
     public static void main(String[] args) {
    	 DoubleLinkList list = new DoubleLinkList();
    	 list.add("Mai hoon na","Lucky","2003", 4.5f);
    	 list.add("kuch kuch hota hai","Nageshwar","2025", 3.5f);
    	 list.display();
    	 list.updateRating("kuch kuch hota hai", 4.5f);
    	 list.display();
    	 
     }
}
