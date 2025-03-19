
import java.util.Arrays;

class Book {
    private String author;
    private String[] chapterNames;

    // No-argument constructor
    public Book() {
        this.author = "";
        this.chapterNames = new String[100]; // Initializes an empty array of size 100
    }

    // Parameterized constructor
    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for chapterNames
    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    // Method to compare authors of two books
    public static boolean compareBooks(Book book1, Book book2) {
        return book1.author.equals(book2.author);
    }

    // Method to compare chapter names and return the book with more chapters
    public static Book compareChapterNames(Book book1, Book book2) {
        if (book1.chapterNames.length > book2.chapterNames.length) {
            return book1;
        } else {
            return book2;
        }
    }
}




