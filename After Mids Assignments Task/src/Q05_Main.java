
//Create a generic class with a type parameter that simulates drawing an item at random out of a box. This
//class could be used for simulating a random drawing. For example, the box might contain Strings
//representing names written on a slip of paper, or the box might contain Integers representing a random
//drawing for a lottery based on numeric lottery picks. Create an add method that allows the user of the class
//to add an object of the specified type along with an isEmpty method that determines whether or not the
//                box is empty. Finally, your class should have a drawItem method that randomly selects an object from the
//        box and returns it. If the user attempts to drawn an item out of an empty box, return null . Write a main
//method that tests your class.

public class Q05_Main {
    public static void main(String[] args) {
        // Example with Strings (names)
        Q05_RandomBOx<String> nameBox = new Q05_RandomBOx<>();
        nameBox.add("Ali");
        nameBox.add("Sara");
        nameBox.add("Ahmed");
        nameBox.add("Zara");

        System.out.println("Random name drawn from box: " + nameBox.drawItem());

        // Example with Integers (lottery numbers)
        Q05_RandomBOx<Integer> lotteryBox = new Q05_RandomBOx<>();
        lotteryBox.add(7);
        lotteryBox.add(14);
        lotteryBox.add(21);
        lotteryBox.add(28);

        System.out.println("Random lottery number drawn: " + lotteryBox.drawItem());

        // Test empty box
       Q05_RandomBOx<String> emptyBox = new Q05_RandomBOx<>();

        System.out.println("Draw from empty box: " + emptyBox.drawItem()); // Should print null
    }
    }

