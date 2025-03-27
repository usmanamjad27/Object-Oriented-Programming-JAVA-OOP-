public class T2_Parent {
    private double num1 , num2 ;

    public T2_Parent(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    // Addition
    public void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    // Subtraction
    public void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    // Multiplication
    public void mul() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    // Division
    public void div() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

    }


}
