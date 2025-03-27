public class Act_02CommissionEmployee {
    private String fName , lName , SSN , grossSale ;
    private double commissionRate;

    public Act_02CommissionEmployee(String fName, String lName, String SSN, String grossSale,double commissionRate) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(String grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void display(){
        System.out.println("First Name : "+fName+"\nLast Name : "+lName+"\nSSN : "+SSN+"\nGross Sale : "+grossSale+"\nCommission Rate : "+commissionRate);
    }
    public double earning(){
        return commissionRate/100;
    }
}
