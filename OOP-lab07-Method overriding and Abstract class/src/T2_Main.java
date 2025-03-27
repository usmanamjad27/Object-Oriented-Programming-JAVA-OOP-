//Write a program that declares two classes. The parent class is called Simple that has two data members
//        num1 and num2 to store two numbers. It also has four member functions.
//The add() function adds two numbers and displays the result. The sub() function subtracts two numbers
//and displays the result.
//The mul() function multiplies two numbers and displays the result. The div() function divides two numbers
//and displays the result.
//The child class is called VerifiedSimple that overrides all four functions. Each function in the child class
//checks the value of data members. It calls the corresponding member function in the parent class if the
//values are greater than 0. Otherwise it displays error message.


public class T2_Main {
    public static void main(String[] args) {
        T2_Child obj = new T2_Child(76,23);
        obj.div();
        obj.add();
        obj.mul();
        obj.sub();

    }
}
