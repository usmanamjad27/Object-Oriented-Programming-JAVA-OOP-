public class T3_linell {
    private T3_point start_pointII ,end_pointII;


 public T3_linell(T3_point start_pointII, T3_point end_pointII) {
     this.start_pointII = start_pointII;
     this.end_pointII = end_pointII;
 }

    public T3_point getStart_pointII() {
        return start_pointII;
    }

    public void setStart_pointII(T3_point start_pointII) {
        this.start_pointII = start_pointII;
    }

    public T3_point getEnd_pointII() {
        return end_pointII;
    }

    public void setEnd_pointII(T3_point end_pointII) {
        this.end_pointII = end_pointII;
    }

    public void find_length(){
//        Hint: formula is: sqrt((x2-x1)2 + (y2-y1)2)
        System.out.println("Length = "+Math.sqrt(Math.pow(end_pointII.getX_cord() - start_pointII.getX_cord(),2)+Math.pow(end_pointII.getY_cord() - start_pointII.getY_cord(),2)));
    }

}
