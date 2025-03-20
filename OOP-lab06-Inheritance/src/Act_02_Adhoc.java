public class Act_02_Adhoc extends Act_02_Regular{
    private int no_of_working_days , wages ;

    public Act_02_Adhoc(String name, String phone, String address, int allowance, int basic_pay, int no_of_working_days, int wages) {
        super(name, phone, address, allowance, basic_pay);
        this.no_of_working_days = no_of_working_days;
        this.wages = wages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("NO of working day :"+no_of_working_days+"\nDaily wages " + wages);
        System.out.println("Now your total salary is "+ (allowance+getBasic_pay()));

    }
}
