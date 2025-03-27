public class Main {
    public static void main(String[] args) {
  Libarian libarian_book = new Libarian("Usman Amjad",87);
  Libarian Libarian_DVD = new Libarian("Ali",43);

  Book bookObj1 = new Book("Center of the Earth","14-09-2024",libarian_book,"Albert bob");
  DVD DVDObj1 = new DVD("The Greedy horns","10-03-2025",Libarian_DVD,180);

      System.out.println("BOOK 1 DETAILS ---");
  bookObj1.displayInfo();
      System.out.println();
      System.out.println("---------------------");
      System.out.println();
      System.out.println("DVD 1 DETAILS ---");
  DVDObj1.displayInfo();

      Book bookObj2 = new Book("Destined with you","29-01-2022",libarian_book,"Lupin");
      DVD DVDObj2 = new DVD("Atlas","27-10-2022",Libarian_DVD,210);

      System.out.println();
      System.out.println("---------------------");
      System.out.println();
      System.out.println("BOOK 2 DETAILS ---");
      bookObj2.displayInfo();
      System.out.println();
      System.out.println("---------------------");
      System.out.println();
      System.out.println("DVD 2 DETAILS ---");
      DVDObj2.displayInfo();
    }
}