
public class T2_Tape extends T2_Publication {
    private double playTime;

    public T2_Tape(String title, int price, double playTime) {
        super(title, price);
        this.playTime = playTime;
    }

    public double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Play Time: " + playTime + " minutes");
    }
}
