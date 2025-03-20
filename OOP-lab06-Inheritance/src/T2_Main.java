//Lab Task 2
//Imagine a publishing company that markets both book and audio-cassette versions of its works. Create a
//class publication that stores the title and price of a publication. From this class derive two classes:
//i. book, which adds a page count and
//ii. tape, which adds a playing time in minutes.
//Each of these three classes should have set() and get() functions and a display() function to display its
//data. Write a main() program to test the book and tape class by creating instances of them, asking the
//        user to fill in their data and then displaying the data with display().

import java.util.Scanner;

public class T2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Book
        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter book price: ");
        int bookPrice = scanner.nextInt();
        System.out.print("Enter book page count: ");
        int bookPages = scanner.nextInt();
        System.out.println("Enter your playtime");
        double playtime = scanner.nextDouble();
        scanner.nextLine();

        T2_Book obj = new T2_Book(bookTitle,bookPrice,bookPages);
        obj.display();

        T2_Tape obj1 = new T2_Tape(bookTitle,bookPrice,playtime);
        obj1.display();

    }
}
