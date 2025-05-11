public class Q03_Student extends Q03_Person{
    private double CGPA ;

    public Q03_Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public boolean isOutstanding() {
       return CGPA > 3.5 ;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("CGPA : "+CGPA);
    }
}
