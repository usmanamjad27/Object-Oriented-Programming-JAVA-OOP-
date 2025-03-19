//Create a class ― Distance‖ with two constructors (no argument, and two argument), two data members
//( feet and inches) . Create setter, getter and display method. Create a method that adds two Distance
//Objects and returns the added Distance Object.



public class Distance {
    private double feet , inches ;

    //  Constructor
    public Distance(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance(){
        feet = 0.0;
        inches = 0.0;
    }

    //  setter and getter

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }
    public double distance(){
        return feet*inches;

    }
// [pass the objects, by using this we calculate the distance of two objects ]
    public double distance_Objects(double a , double b){
        return a+b;
    }

    // display method
    public void display(){
        System.out.println("Feet = "+ feet);
        System.out.println("Inches = "+ inches);

    }
}
