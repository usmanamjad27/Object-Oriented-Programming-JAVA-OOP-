public class Main {

    public static void main(String[] args) {
     Derived obj = new Derived();
     obj.setX(46);
     obj.setY(65);
     obj.getY();
     obj.getX();
        System.out.println(obj.getY());
     System.out.println(obj.getX() );

     obj.display1();
     obj.display();

    }
}
