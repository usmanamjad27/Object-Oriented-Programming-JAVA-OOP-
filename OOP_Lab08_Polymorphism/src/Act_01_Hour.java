public class Act_01_Hour extends Act_01_Employee {
    private double wage , hour;

    public Act_01_Hour(String fName, String lName, String socialSecurityNumber, double wage, double hour) {
        super(fName, lName, socialSecurityNumber);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earning() {
        if (hour <= 40 ) {// no overtime
            return wage * hour;
        }else{
            return 40 * wage + (hour - 40 ) * wage * 1.5;}
    }
}
