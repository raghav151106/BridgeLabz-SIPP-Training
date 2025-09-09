package Keywords;

class Book {
    // Static variable
    static String libraryName = "City Central Library";

    // Final variable (unique and unchangeable)
    final String isbn;
    String title;
    String author;

    // Constructor using "this"
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display details with instanceof check
    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN12345");
        Book b2 = new Book("Wings of Fire", "A.P.J Abdul Kalam", "ISBN67890");

        Book.displayLibraryName();
        System.out.println();
        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
    }
}

