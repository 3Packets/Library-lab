import java.util.ArrayList;
public class Library {

	// Add the missing implementation to this class
	ArrayList<Book> biblio;
	String title;
	static int openingHours = 8;
	String address;
	
	public Library(String addr) {
		this.biblio = new ArrayList<Book>();
		this.address = addr;
	}
		

	public boolean addBook(Book b) {
	
		// TODO Auto-generated method stub
		return this.biblio.add(b);
	}

	private static void printOpeningHours() {
		// TODO Auto-generated method stub
		System.out.println();
		
		
	}

	private void printAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.address);
		
	}

	private void borrowBook(String string) {
		// TODO Auto-generated method stub
		
		boolean found = false;
		boolean success = false;
		for (Book b : this.biblio) {
			StringBuffer bookTitle = null;
			if (b.bookTitle.equals(bookTitle)) {
				found = true;
				if (!b.isBorrowed()) {
					b.borrowed();
					b.returned();
					System.out.println();
					success = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.println();
		}
		else if (!success) {
			System.out.println();
		}
	}

	private void returnBook(String bookTitle) {
		// TODO Auto-generated method stub
		boolean found = false;
		boolean success = false;
		for (Book b : this.biblio) {
			if (b.bookTitle.equals(bookTitle)) {
				found = true;
				if (b.isBorrowed()) {
					b.returned();
				}
			}
		}
		
	}

	private void printAvailableBooks() {
		// TODO Auto-generated method stub
		this.printAvailableBooks();
		boolean available = false;
		
		
	}
	  public static void main(String[] args) {
	        // Create two libraries
	        Library firstLibrary = new Library("11 Main Rd");
	        Library secondLibrary = new Library("5989 Broadway");

	        // Add four books to the first library
	        firstLibrary.addBook(new Book("The Da Vinci Code"));
	        firstLibrary.addBook(new Book("Le Petit Prince"));
	        firstLibrary.addBook(new Book("A Tale of Two Cities"));
	        firstLibrary.addBook(new Book("The Lord of the Rings"));

	        // Print opening hours and the addresses
	        System.out.println("Library hours:");
	        printOpeningHours();
	        System.out.println();

	        System.out.println("Library addresses:");
	        firstLibrary.printAddress();
	        secondLibrary.printAddress();
	        System.out.println();

	        // Try to borrow The Lords of the Rings from both libraries
	        System.out.println("Borrowing The Lord of the Rings:");
	        firstLibrary.borrowBook("The Lord of the Rings");
	        firstLibrary.borrowBook("The Lord of the Rings");
	        secondLibrary.borrowBook("The Lord of the Rings");
	        System.out.println();

	        // Print the titles of all available books from both libraries
	        System.out.println("Books available in the first library:");
	        firstLibrary.printAvailableBooks();
	        System.out.println();
	        System.out.println("Books available in the second library:");
	        secondLibrary.printAvailableBooks();
	        System.out.println();

	        // Return The Lords of the Rings to the first library
	        System.out.println("Returning The Lord of the Rings:");
	        firstLibrary.returnBook("The Lord of the Rings");
	        System.out.println();

	        // Print the titles of available from the first library
	        System.out.println("Books available in the first library:");
	        firstLibrary.printAvailableBooks();
	    }
} 

