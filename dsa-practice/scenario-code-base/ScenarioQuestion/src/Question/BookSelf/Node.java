package Question.BookSelf;

public class Node {
    String name;
    String author;
    double price;
    Node next;
    public Node(String name,String author,double price) {
    	this.name = name;
    	this.author = author;
    	this.price = price;
    	this.next = null;
    }
}
