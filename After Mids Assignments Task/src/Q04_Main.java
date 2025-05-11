
//Question 2:
//Below is a code skeleton for an interface called “Enumeration” and a class called “NameCollection “.
//Enumeration provides an interface to sequentially iterate through some type of collection. In this case, the
//collection will be the class NameCollection that simply stores a collection of names using an array of
//        strings. interface Enumeration { // return true if a value exists in the next index public boolean hasNext(int
//    index); // returns the next element in the collection as an Object public Object getNext(int index); }
////NameCollection implements a collection of names using a simple array. class NameCollection { String[]
//    names = new String[100]; } Create constructor and abstract methods of interface in the class
//NameCollection. Then write a main method that creates a NamesCollection object with a sample array of
//strings, and then iterates through the enumeration outputting each name using the getNext() method.

public class Q04_Main {
    public static void main(String[] args) {

        String[] sampleNames = {"Ali", "Sara", "Ahmed", "Zara"};
        Q04_NameCollection nameCollection = new Q04_NameCollection(sampleNames);

        System.out.println("Names in the collection:");
        for (int i = 0; nameCollection.hasNext(i); i++) {
            System.out.println(nameCollection.getNext(i));
        }
    }
}
