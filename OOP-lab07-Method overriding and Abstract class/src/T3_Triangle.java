public class T3_Triangle extends T3_Shape{
    public T3_Triangle(int no_of_lines, String penColor, String fillColor) {
        super(no_of_lines, penColor, fillColor);
    }
    @Override
    public void draw() {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
