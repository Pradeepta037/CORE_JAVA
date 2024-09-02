class Book {
    String title;
    String author;
    int year;

    // Parameterized constructor
    Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    // Method to display attributes of the book
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Creating a Book object using the parameterized constructor
        Book book = new Book("Introduction to Core JAVA", "Balagurusamy", 1985);
        // Displaying the attributes of the book
        book.display();
    }
}
