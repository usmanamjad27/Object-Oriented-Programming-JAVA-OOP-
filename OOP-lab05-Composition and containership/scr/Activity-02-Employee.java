class employee {
    private String name;
    private String fname;
    private Activity_02_Date birthdate;
    private Activity_02_Date hiredate;
    employee() {
    }
    employee(String x, String y, Activity_02_Date
            birthofDate, Activity_02_Date dateofHire) {
        name = x;
        fname = y;
        birthdate = birthofDate;
        hiredate = dateofHire;
    }
    public void setname(String x) {
        name = x;
    }
    public String getname() {
        return name;
    }
    public void setfname(String x) {
        fname = x;
    }
    public String getfname() {
        return fname;
    }
    public void setbirthdate(Activity_02_Date b) {
        birthdate = b;
    }
    public Activity_02_Date getbirthdate() {
        return birthdate;
    }
    public void sethiredate(Activity_02_Date h) {
        hiredate = h;
    }
    public Activity_02_Date gethiredate() {
        return hiredate;
    }
    public void display() {
        System.out.println("Name: " + name + " Father Name: " + fname);
        birthdate.display();
        hiredate.display();
    }
}