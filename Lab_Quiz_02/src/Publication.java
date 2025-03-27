public class Publication {
    private String title ;
    private int price ;

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getprice() {
        return price;
    }

    public void setAttribute(int price) {
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Title Of Book is  ' "+title+" ' \n The Price of the Book is $"+price);
    }
}
