package com.constructinstance.level1;
import java.util.*;

public class Book {
       String bookName;
       String authorName;
       double price;
       public Book() {
    	   
       }
      
       public Book(String bookName,String authorName,double price) {
    	   this.bookName = bookName;
    	   this.authorName = authorName;
    	   this.price = price;
       }
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   String s = sc.nextLine();
    	   String a = sc.nextLine();
    	   double p = sc.nextDouble();
    	  
    	   Book b = new Book(s,a,p);
    	   
    	   System.out.println(b.authorName);
    	   System.out.println(b.bookName);
    	   System.out.println(b.price);
       }
}
