abstract class Act_01_Employee {
    private String fName ,lName,SocialSecurityNumber;

    public Act_01_Employee(String fName, String lName, String socialSecurityNumber) {
        this.fName = fName;
        this.lName = lName;
        SocialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "First Name='" + fName + '\'' +
                ", Last Name='" + lName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                '}';
    }
    public abstract double earning();

}
