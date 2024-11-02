
public interface LibraryOperations {
void addBook(Book book);
void viewBooks();
void borrowBook(int bookId);
void returnBook(int bookId);
boolean findbook(int bookId); 
boolean isAvailable(int bookId);
}
