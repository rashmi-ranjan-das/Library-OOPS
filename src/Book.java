
public class Book {
	
final int bookId;
String title;
String author;
String ISBN;
boolean isAvailable;

public Book(final int bookId) {
	this.bookId=bookId;
}

public void setBook(String title,String author,String ISBN) {
	this.title=title;
	this.author=author;
	this.ISBN=ISBN;
	this.isAvailable=true;
}

public void display() {
	System.out.println("BookId:"+this.bookId);
	System.out.println("Title:"+this.title);
	System.out.println("Author:"+this.author);
	System.out.println("ISBN:"+this.ISBN);
	System.out.println("Is the book available:"+(this.isAvailable?"YES":"NO"));
}


}
