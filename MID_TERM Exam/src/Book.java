 class Book extends LibraryItem {
    private Libarian libarian; // using composition
    private  String author;

     public Book(String title, String pDate, Libarian libarian, String author) {
         super(title, pDate);
         this.libarian = libarian;
         this.author = author;
     }

     public Libarian getLibarian() {
         return libarian;
     }

     public void setLibarian(Libarian libarian) {
         this.libarian = libarian;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     @Override
     public void displayInfo() {

         super.displayInfo();
         System.out.println(libarian.display());
         System.out.println("Author of book is "+author );

     }
 }
