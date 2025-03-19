
/*here we use inheritance instead of writing this x code multiple time we  use the formula of inheritance that get the base valve from
            already existing class so ,we don't need to write again base functionality in drived class */
public class Derived extends Base {


        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    public void display() {
        System.out.println("I am another a constructor");
    }
    }

