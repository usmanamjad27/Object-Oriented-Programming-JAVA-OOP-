import java.util.Scanner;

public class T2_Publication {


    protected String title ;
    protected int price;

    public T2_Publication( String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        System.out.println("Title of the book is "+"'"+title+"'"+"\nPrice : "+price+"/-");
    }
}
