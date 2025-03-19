public class Main {
    public static void main(String[] args) {
//        Distance obj1 = new Distance(53,78);
//        Distance obj2 = new Distance(56,76);
//        obj1.display();
//        obj2.display();
//       double a = obj1.distance();
//       double b = obj2.distance();
//        System.out.println("THe distance of  object 1 is "+a);
//        System.out.println("THe distance of  object 2 is "+b);
//
//        System.out.println(obj1.distance_Objects(a,b));


        //----------------------------------------------------------------------------------------------------


                // Creating first book using no-argument constructor and setting values
                Book book1 = new Book();
                book1.setAuthor("Ali");
                book1.setChapterNames(new String[]{"OOP", "PF", "Discrete", "Math"});

                // Creating second book using parameterized constructor
                Book book2 = new Book("Usman", new String[]{"Math", "English", "Science"});

                // Comparing authors
                if (Book.compareBooks(book1, book2)) {
                    System.out.println("Both books have the same author.");
                } else {
                    System.out.println("Books have different authors.");
                }

                // Comparing chapter names
                Book largerBook = Book.compareChapterNames(book1, book2);
                System.out.println("The book with more chapters is authored by: " + largerBook.getAuthor());

//-----------------------------------------------------------------------------------------------------------------

//        Fraction f1 = new Fraction(16,16);
//        Fraction f2 = new Fraction(8,4);
//         f1.fraction();
//         f2.fraction();
//          f1.display();
//        f2.display();
//
//               System.out.println(f1.check(f1,f2) );

    //-------------------------------------------------------------------------------------------------------




    }
}