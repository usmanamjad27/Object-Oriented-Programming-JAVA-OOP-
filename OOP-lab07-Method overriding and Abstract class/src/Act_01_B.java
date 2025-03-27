public class Act_01_B extends Act_01_A {
    int c;

    public Act_01_B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("C is : "+c);
    }
}
