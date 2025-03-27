//Lab Task 3
//Create an abstract class that stores data about the shapes e.g. Number of Lines in a Shape, Pen Color,
//Fill Color and an abstract method draw. Implement the method draw for Circle, Square and Triangle
//subclasses, the better approach is to draw these figures on screen, if you can’t then just use a display
//message in the draw function.

public class T3_Main {
    public static void main(String[] args) {
        T3_Circle obj = new T3_Circle(12, "Blue", "Yes");
        obj.display();
        obj.draw();
        T3_Square obj1 = new T3_Square(12, "Blue", "Yes");
        obj1.display();
        obj1.draw();
        T3_Triangle objj = new T3_Triangle(12, "Blue", "Yes");
        objj.display();
        objj.draw();
    }
}
