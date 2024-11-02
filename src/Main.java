import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  int choice=0;
	  Library lib=new Library();
	  while(choice!=5) {
		  System.out.println("Choose your option from the following\n1.Add a book\n2.View all books\n3.Borrow a book\n4.Return abook\n5.Exit ");
		  Scanner sc=new Scanner(System.in);
		  choice=sc.nextInt();
		  sc.nextLine();
	  switch(choice) {
	  case 1:
		  System.out.println("Enter your BOOKID: ");
		  int bookId=sc.nextInt();
		  sc.nextLine();
		  if(lib.findbook(bookId)) {
			  System.out.println("The book already exists");
			  break;
		  }
		  System.out.println("Enter your Book Title: ");
		  String title=sc.nextLine();
		  System.out.println("Enter the Author's Name: ");
		  String author=sc.nextLine();
		  System.out.println("Enter the ISBN: ");
		  String ISBN=sc.nextLine();
		  Book b=new Book(bookId);
		  b.setBook(title, author, ISBN);
		  lib.addBook(b);
		  System.out.println("Book added successfully");
		  break;
	  case 2:
		  if(lib.currentBookcount==0) {
			  System.out.println("Library is empty");
			  break;
		  }
		  lib.viewBooks();
		  break;
	  case 3:
		  System.out.println("Enter your BOOKID: ");
		  bookId=sc.nextInt();
		  sc.nextLine();
		  if(lib.findbook(bookId)==false) {
			  System.out.println("Book is not present in the library");
			  break;
		  }
		  if(lib.isAvailable(bookId)==false) {
			  System.out.println("The book already borrowed");
			  break;
		  }
		  lib.borrowBook(bookId);
		  System.out.println("Book borrowed successfully");
		  break;
	  case 4:
		  System.out.println("Enter your BOOKID: ");
		  bookId=sc.nextInt();
		  sc.nextLine();
		  if(lib.isAvailable(bookId)==true) {
			  System.out.println("Book is already returned");
			  break;
		  }
		  lib.returnBook(bookId);
		  System.out.println("Book returned successfully");
	      break;
	  case 5:
		  System.out.println("Exited Successfully");
		  break;
	  default:
		System.out.println("Wrong choice!!\n Enter again");	  
	  }
	  }
}
}
