import java.util.ArrayList;


    class Book {
        private String title;
        private String author;
        private int chapters;

        // Default constructor
        public Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.chapters = 0;
        }

        // Parameterized constructor
        public Book(String title, String author, int chapters) {
            this.title = title;
            this.author = author;
            this.chapters = chapters;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getChapters() {
            return chapters;
        }

        public void setChapters(int chapters) {
            this.chapters = chapters;
        }

        // Overloaded method to compare books by author
        public boolean compareBooks(Book otherBook) {
            return this.author.equalsIgnoreCase(otherBook.author);
        }

        // Overloaded method to compare books by chapters
        public String compareBooks(Book book1, Book book2) {
            if (book1.chapters > book2.chapters) {
                return book1.title + " has more chapters.";
            } else if (book1.chapters < book2.chapters) {
                return book2.title + " has more chapters.";
            } else {
                return "Both books have the same number of chapters.";
            }
        }

        // Display book details
        public void displayBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Chapters: " + chapters);
            System.out.println("----------------------");
        }
    }



