//Create an Address class, which contains street#, house#, city and code. Create another class Person that
//        contains an address of type Address. Give appropriate get and set functions for both classes. Test class
//person in main.

public class T1_Main {
    public static void main(String[] args) {


        T1_Address usmanad = new T1_Address("B645/- ", "87", "PAkpattan", 57400);
        T1_Person usman = new T1_Person("Usman Amjad", usmanad);
        System.out.println(usman);
    }
}
