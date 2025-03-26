public class T2_Book {
    private T1_Person author;
    private String book_name , publisher;

    public T2_Book(T1_Person author, String book_name, String publisher) {
        this.author = author;
        this.book_name = book_name;
        this.publisher = publisher;
    }

    public T1_Person getAuthor() {
        return author;
    }

    public void setAuthor(T1_Person author) {
        this.author = author;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

//    @Override
//    public String toString() {
//        System.out.println("Book Name : "+book_name +"\nPublisher name : "+ publisher);
//        return super.toString();
//
//    }
    public void display(){
        System.out.println("Book Name : "+book_name +"\nPublisher name : "+ publisher);


    }
}
