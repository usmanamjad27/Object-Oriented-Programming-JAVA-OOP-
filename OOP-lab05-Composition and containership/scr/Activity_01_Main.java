public class Activity_01_Main {
    public static void main(String[] args) {

        Activity_01_studentRecord s = new Activity_01_studentRecord();
        s.setDegree("MBA");
        Activity_01_Employee e = new Activity_01_Employee();
        e.setEmp_id(1);
        e.setSalary(25000);
        Activity_01_Manager m1 = new Activity_01_Manager("financeManager", 5000, e, s);
        m1.display();


    }
}