//Activity 1:
//Composition is about expressing relationships between objects. Think about the example of a
//manager. A manager has the properties e.g Title and club dues. A manager has an employment
//record. And a manager has an educational record. The phrase "has a" implies a relationship where
//the manager owns, or at minimum, uses, another object. It is this "has a" relationship which is the
//basis for composition. This example can be programmed as follows:

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