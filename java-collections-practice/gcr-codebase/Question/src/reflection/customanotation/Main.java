package reflection.customanotation;

import java.lang.annotation.Annotation;

public class Main {
      public static void main(String[] args) {
		BookWriter b = new BookWriter();
		Class<?> cl = b.getClass();
		Annotation an = cl.getDeclaredAnnotation(Author.class);
		Author a = (Author)an;
		System.out.println("Author Name : "+a.name());
	}
}
