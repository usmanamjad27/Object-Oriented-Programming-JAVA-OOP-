public abstract class T3_Shape {
    private int no_of_lines ;
    private String penColor ,fillColor ;

    public T3_Shape(int no_of_lines, String penColor, String fillColor) {
        this.no_of_lines = no_of_lines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public int getNo_of_lines() {
        return no_of_lines;
    }

    public void setNo_of_lines(int no_of_lines) {
        this.no_of_lines = no_of_lines;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public abstract void draw();

    public void display(){
        System.out.println("No of lines : "+no_of_lines+"\nPen Color : "+penColor+"\nFill Color : "+fillColor);
    }

}
