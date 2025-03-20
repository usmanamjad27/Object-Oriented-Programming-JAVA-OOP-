public class Act_02_Regular extends Act_02_Employee {
    private int basic_pay;

    public Act_02_Regular(String name, String phone, String address, int allowance, int basic_pay) {
        super(name, phone, address, allowance);
        this.basic_pay = basic_pay;
    }

    public int getBasic_pay() {
        return basic_pay;
    }

    @Override
    public void display() {

        super.display();
        System.out.println("congratulation we added "+allowance+" allowance in your salary for you efficient work");
        System.out.println("Basic salary of "+name+" is "+basic_pay);

    }
}
