public class T3_Laptop extends T3_Computer {
    private int length, width, height, weight;

    public T3_Laptop(int word_size, double storage_size, double speed, double memory_size, int length, int width, int height, int weight) {
        super(word_size, storage_size, speed, memory_size);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public T3_Laptop(){
        length = 52 ;
        width = 43 ;
        height = 6 ;
        weight = 70;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void displayFeatures() {

        super.displayFeatures();
        System.out.println("The length of the laptop is "+length+"cm\nWidth is "+width+"cm\n Height is "+height+"feet\nWeight is "+weight+"Kg/g");
    }
}
