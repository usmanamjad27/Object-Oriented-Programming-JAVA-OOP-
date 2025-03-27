import java.util.Scanner;

public class T1_Movie {
    private String title;
    private String mpaaRating;
    private int idNumber;

    public T1_Movie(String title, String mpaaRating, int idNumber) {
        this.title = title;
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public void display(){
        System.out.println("Movie Title: " + title);
        System.out.println("MPAA Rating: " + mpaaRating);
        System.out.println("ID Number: " + idNumber);
    }
    public double calclatefee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many days you bought this content : ");
        double days = sc.nextInt();
        System.out.println("The number of days  that you want to borrow this movie is "+days+"days");
        return  days;
    }
}
