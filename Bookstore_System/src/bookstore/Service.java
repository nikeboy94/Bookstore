package bookstore;

import java.util.HashMap;

public class Service {
	
	HashMap<String,Book> bookMap = new HashMap<String,Book>();
	
	Book book1 = new Book(1, "Spider-Man", "Stan Lee", "Comic");
	Book book2 = new Book(2, "Green Eggs and Ham", "Dr Seuss", "Childrens");
	Book book3 = new Book(3, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy");
		
	public Service() {
		bookMap.put("spider", book1);
		bookMap.put("green", book2);
		bookMap.put("harry", book3);
	}
	
	

}
