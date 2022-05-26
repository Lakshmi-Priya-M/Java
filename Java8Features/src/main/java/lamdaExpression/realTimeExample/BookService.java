package lamdaExpression.realTimeExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksInSort(){
		List<Book> books = new BookDao().getBooks();
		// 1. one way of implementation
		//Collections.sort(books, new MyComparator());
		
		// 2. Using Anonymous implementation
		/*
		 * Collections.sort(books, new Comparator<Book>(){
		 * 
		 * @Override public int compare(Book o1, Book o2) { return
		 * o1.getName().compareTo(o2.getName()); }
		 * 
		 * });
		 */
		
		// 3. Using Lambda Expression
		
		Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		return books;
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksInSort());
	}
}

/*
 * class MyComparator implements Comparator<Book>{
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o1.getName().compareTo(o2.getName()); }
 * 
 * }
 */