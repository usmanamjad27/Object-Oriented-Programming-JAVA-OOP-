public class T1_Drama extends T1_Movie {
    private double latefee;

    public T1_Drama(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
        this.latefee = 2;
    }

    public double getLatefee() {
        return latefee;
    }

    public void setLatefee(double latefee) {
        this.latefee = latefee;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Late fee per day is $"+latefee);
    }

    @Override
    public double calclatefee() {
        double total = super.calclatefee()*latefee;
        System.out.println("Total late fee is $"+total);
        return total;
    }
}
