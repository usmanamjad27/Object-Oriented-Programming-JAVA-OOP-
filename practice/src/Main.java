import java.io.File;

public class Main {
    public static void main(String[] args) {


       product p1 = new product("Apple",0.5,100);
       product p2 = new product("iphone",89,90);
       product p3 = new product("Mac Book",150,150);
       product p4 = new product("Samsung",67,10);
        product p5 = new product("I pad",70,100);

        inventory store = new inventory();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);
        store.addProduct(p5);
        store.display();


//      we can also write like this :
//        store.addProduct(new product("Apple",0.5,100));
//        store.addProduct(new product("iphone",89,90));
//        store.addProduct(new product("Mac Book",150,150));
//        store.addProduct(new product("Samsung",67,10));
//        store.addProduct(new product("I pad",70,100));



    }
}