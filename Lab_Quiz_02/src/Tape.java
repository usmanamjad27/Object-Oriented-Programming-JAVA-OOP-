public class Tape  extends Publication{
    private int pLayTime;

    public Tape(String title, int price, int pLayTime) {
        super(title, price);
        this.pLayTime = pLayTime;
    }

    public int getpLayTime() {
        return pLayTime;
    }

    public void setpLayTime(int pLayTime) {
        this.pLayTime = pLayTime;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The play time of this book is "+pLayTime);
    }
}
