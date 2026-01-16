package Questions.SmartShelf;

public class Main {
	  public static void main(String[] args) {
	        Book[] shelf = {
	            new Book("Algorithms"),
	            new Book("Data Structures"),
	            new Book("Artificial Intelligence"),
	            new Book("Computer Networks")
	        };

	        SmartShelf.insertionSort(shelf);
	        SmartShelf.display(shelf);
	    }
}
