public class T3_Circle extends T3_Shape{
    public T3_Circle(int no_of_lines, String penColor, String fillColor) {
        super(no_of_lines, penColor, fillColor);
    }


    @Override
    public void draw() {
        for (int i = -5; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                if (i * i + j * j <= 5 * 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Spaces for better shape
                }
            }
            System.out.println();
        }

    }

}
