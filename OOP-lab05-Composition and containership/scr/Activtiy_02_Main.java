//Activity 2:
//The program below represents an employee class which has two Date objects as data members.


public class Activtiy_02_Main {
    public static void main(String[] args) {
        Activity_02_Date b = new Activity_02_Date(1, 12, 1990);
        Activity_02_Date h = new Activity_02_Date(5, 6, 2016);
        employee e1 = new employee("xxx", "yyyy",b, h);
        e1.display();

    }
}
