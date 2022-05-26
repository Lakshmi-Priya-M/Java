package lamdaExpression.RealTimeExample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks(){
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book(101,"Spring", 18));
		listOfBooks.add(new Book(102,"Hibernate", 10));
		listOfBooks.add(new Book(103,"Java", 19));
		listOfBooks.add(new Book(104,"MongoDb", 23));
		listOfBooks.add(new Book(105,"Docker", 43));
		return listOfBooks;
	}
}
