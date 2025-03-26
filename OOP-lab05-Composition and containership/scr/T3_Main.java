//Design a class Point with two data members x-cord and y-cord. This class should have an arguments
//        constructor, setters, getters and a display function.
//Now create another class ―Line‖, which contains two Points ―startPoint‖ and ―endPoint‖. It should
//have a function that finds the length of the line.
//
//Hint: formula is: sqrt((x2-x1)2 + (y2-y1)2)
//Create two line objects in runner and display the length of each line.

public class T3_Main {
    public static void main(String[] args) {
        T3_point start = new T3_point(13,15);
        T3_point end = new T3_point(15,20);
        T3_linell obj = new T3_linell(start,end);
        obj.find_length();
    }
}
