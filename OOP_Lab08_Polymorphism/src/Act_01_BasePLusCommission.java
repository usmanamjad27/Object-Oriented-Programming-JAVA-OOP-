public class Act_01_BasePLusCommission extends Act_01_Employee{
    private double baseSalary;

    public Act_01_BasePLusCommission(String fName, String lName, String socialSecurityNumber, double baseSalary) {
        super(fName, lName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earning() {
        return baseSalary + super.earning();
    }
}
