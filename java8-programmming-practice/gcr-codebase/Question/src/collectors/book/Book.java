package collectors.book;

public class Book {
     public String genre;
     public String bookName;
     public String Author;
     public int page;
     
	 public Book(String genre, String bookName, String author, int page) {
		this.genre = genre;
		this.bookName = bookName;
		Author = author;
		this.page = page;
	 }

	 @Override
	 public String toString() {
		return "Book [genre=" + genre + ", bookName=" + bookName + ", Author=" + Author + ", page=" + page + "]";
	 }
     
     
}
