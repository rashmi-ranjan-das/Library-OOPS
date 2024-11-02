

public class Library implements LibraryOperations{
Book[] books=new Book[50];
int currentBookcount=0;
@Override
public void addBook(Book book) {
	this.books[this.currentBookcount]=book;
	this.currentBookcount++;
}
@Override
public void viewBooks() {
	for(int i=0;i<this.currentBookcount;i++) {
		System.out.println("Book "+Integer.toString(i+1));
		this.books[i].display();
		System.out.println("\n");
	}
}
@Override
public void borrowBook(int bookId) {
	for(int i=0;i<this.currentBookcount;i++) {
		if(this.books[i].bookId==bookId) {
			this.books[i].isAvailable=false;
			break;
		}
	}
}
@Override
public void returnBook(int bookId) {
	for(int i=0;i<this.currentBookcount;i++) {
		if(this.books[i].bookId==bookId) {
			this.books[i].isAvailable=true;
			break;
		}
	}
}
@Override
public boolean findbook(int bookId) {
	for(int i=0;i<this.currentBookcount;i++) {
		if(this.books[i].bookId==bookId) {
			return true;
		}
	}
	return false;
}
@Override
public boolean isAvailable(int bookId) {
	for(int i=0;i<this.currentBookcount;i++) {
		if(this.books[i].bookId==bookId && this.books[i].isAvailable) {
			return true;
		}
	}
	return false;
}

}
