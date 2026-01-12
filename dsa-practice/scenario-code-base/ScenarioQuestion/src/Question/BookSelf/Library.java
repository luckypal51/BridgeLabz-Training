package Question.BookSelf;

import java.util.HashMap;

public class Library {
     HashMap<String,LinkedList> map = new HashMap<>();
     
     public void addBook(String genre, String name,String author,double price) {
    	 for(var m:map.entrySet()) {
    		 if(m.getKey().equalsIgnoreCase(genre)) {
    			 LinkedList list = m.getValue();
    			 list.add(name, author, price);
    			 return;
    		 }
    	 }
    	 LinkedList list = new LinkedList();
    	 list.add(name, author, price);
    	 map.put(genre, list);
    	 System.out.println("Successfully added book with genre");
    	 
     }
     public void viewBook() {
    	 for(var m: map.entrySet()) {
    		 System.out.println("\n----------------");
    		 System.out.println("Genre : "+m.getKey());
    		 System.out.println("-----------------");
    		 m.getValue().view();
    	 }
     }
     public void borrow(String genre,String name) {
    	 for(var m:map.entrySet()) {
    		 if(m.getKey().equalsIgnoreCase(genre)) {
    			 m.getValue().delete(name);
    			 return;
    		 }
    	 }
    	 System.out.println("Genre Not Found!");
     }
}
