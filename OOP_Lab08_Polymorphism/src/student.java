public class student {
    private double CGPA;


    public student(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public boolean isoutstanding(){
        if (CGPA>3.5)
            return true;
        else
            return false;

    }
}
