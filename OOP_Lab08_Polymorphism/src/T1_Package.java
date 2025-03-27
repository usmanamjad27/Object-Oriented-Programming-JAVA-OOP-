public class T1_Package {
    private String Sname ,Saddress, Rname,Raddress;
    private double weight_ounce;
    private double cost_per_ounce;

    public T1_Package(String sname, String saddress, String rname, String raddress, double weight_ounce, double cost_per_ounce) {
        Sname = sname;
        Saddress = saddress;
        Rname = rname;
        Raddress = raddress;
        this.weight_ounce = weight_ounce;
        this.cost_per_ounce = cost_per_ounce;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSaddress() {
        return Saddress;
    }

    public void setSaddress(String saddress) {
        Saddress = saddress;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getRaddress() {
        return Raddress;
    }

    public void setRaddress(String raddress) {
        Raddress = raddress;
    }

    public double getWeight_ounce() {
        return weight_ounce;
    }

    public void setWeight_ounce(double weight_ounce) {
        this.weight_ounce = weight_ounce;
    }

    public double getCost_per_ounce() {
        return cost_per_ounce;
    }

    public void setCost_per_ounce(double cost_per_ounce) {
        this.cost_per_ounce = cost_per_ounce;
    }
}
