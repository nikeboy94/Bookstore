package bookstore;

public class Book {

	private int bookID;
	private String name;
	private String author;
	private String genre;

	public Book(int bookID, String name, String author, String genre) {
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getBookID(){
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	
}
