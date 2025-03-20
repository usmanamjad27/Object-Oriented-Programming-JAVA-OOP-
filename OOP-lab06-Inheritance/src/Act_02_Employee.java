public class Act_02_Employee {
    protected String name , phone , address ;
    protected int allowance;

    public Act_02_Employee(String name, String phone, String address, int allowance) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.allowance = allowance;
    }

    public void display(){
        System.out.println("Name : "+ name + "\nPhone : "+phone+ "\nAddress : "+address);
    }
}
