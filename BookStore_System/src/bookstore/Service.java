package bookstore;

import java.util.HashMap;

public class Service {
	
	HashMap<String,Book> bookMap = new HashMap<String,Book>();
	
	Book spider = new Book(1, "Spider-Man", "Stan Lee", "Comic");
	Book green = new Book(2, "Green Eggs and Ham", "Dr Seuss", "Childrens");
	Book harry = new Book(3, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy");
		
	public Service() {}
	
	

}
