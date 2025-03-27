public class T3_Square extends T3_Shape{
    public T3_Square(int no_of_lines, String penColor, String fillColor) {
        super(no_of_lines, penColor, fillColor);
    }

    @Override
    public void draw() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

