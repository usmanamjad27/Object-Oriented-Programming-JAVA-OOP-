public class T2_Child extends T2_Parent {
    public T2_Child(double num1, double num2) {
        super(num1, num2);
    }
    // Overriding add method
    @Override
    public void add() {
        if (getNum1() > 0 && getNum2() > 0) {
            super.add();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for addition.");
        }
    }

    // Overriding sub method
    @Override
    public void sub() {
        if (getNum1() > 0 && getNum2() > 0) {
            super.sub();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for subtraction.");
        }
    }

    // Overriding mul method
    @Override
    public void mul() {
        if (getNum1() > 0 && getNum2() > 0) {
            super.mul();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for multiplication.");
        }
    }

    // Overriding div method
    @Override
    public void div() {
        if (getNum1() > 0 && getNum2() > 0) {
            super.div();
        } else {
            System.out.println("Error: Numbers must be greater than 0 for division.");
        }
}}
