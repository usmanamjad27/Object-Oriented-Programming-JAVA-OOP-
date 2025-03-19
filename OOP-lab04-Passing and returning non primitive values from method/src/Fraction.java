public class Fraction {

    private double a, b;

    public Fraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Fraction() {
        a = 0;
        b = 0;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double fraction() {
        return a / b;
    }

    public void display() {
        System.out.println("The fraction of two integer is " + fraction());
    }

    public boolean check(Fraction f1, Fraction f2) {
        if (f1.fraction() == f2.fraction()) {
            return true;
        } else {
            return false;
        }
    }
}
