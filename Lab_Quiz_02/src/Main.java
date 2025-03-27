import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details here :");
        String title = sc.nextLine();
        int price = sc.nextInt();
        int  pageCount = sc.nextInt();
        int playTime = sc.nextInt();
        Book b1 = new Book(title,price,pageCount);
        Tape t1 = new Tape(title,price,playTime);
        b1.displayInfo();
        t1.displayInfo();


    }
}