
public class Main {
    public static void main(String[] args) {
        // Creating book objects using parameterized constructor
        Book book1 = new Book("Java Programming", "James Gosling", 15);
        Book book2 = new Book("Python Basics", "Guido van Rossum", 12);
        Book book3 = new Book("Advanced Java", "James Gosling", 20);

        // Displaying book details
        System.out.println("Book Details:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        // Comparing books by author
        System.out.println("Do book1 and book2 have the same author? " + book1.compareBooks(book2));
        System.out.println("Do book1 and book3 have the same author? " + book1.compareBooks(book3));

        // Comparing books by chapters
        System.out.println(book1.compareBooks(book1, book2));
//        there is doesnot matter we wrote book1. or book2. or something else
        System.out.println(book2.compareBooks(book1, book2));
    }
}