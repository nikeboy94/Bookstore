package bookstore;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creating service with initial books and map");
		Service s = new Service();
		
		System.out.println("Creating new book");
		Book book4 = new Book(4, "New Book", "New Author", "dno");
		
		System.out.println("Adding book to the hashmap");
		s.addBook("NB", book4);
		
		System.out.println("Removing a book to the hashmap");
		s.removeBook("harry");

	}

}
