//Lab Task 3
//Write a base class Computer that contains data members of word_size(in bits), memory_size (in megabytes),
//storage_size (in megabytes) and speed (in megahertz). Derive a Laptop class that is a kind of computer but
//        also specifies the object’s length, width, height, and weight. Member functions for both classes should
//include a default constructor, a constructor to initialize all components and a function to display data
//members.


public class T3_Main {
    public static void main(String[] args) {

         // By using parametrized constructor
        T3_Laptop dell1 = new T3_Laptop();
        // By using parametrized constructor
        T3_Laptop dell2 = new T3_Laptop(32,256,4,16,44,46,4,30);
        dell1.displayFeatures();
        dell2.displayFeatures();



    }
}
