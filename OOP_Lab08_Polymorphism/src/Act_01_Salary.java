public class Act_01_Salary extends Act_01_Employee {
    private double weeklySalary;

    public Act_01_Salary(String fName, String lName, String socialSecurityNumber, double weeklySalary) {
        super(fName, lName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning() {
        return weeklySalary;
    }
}
