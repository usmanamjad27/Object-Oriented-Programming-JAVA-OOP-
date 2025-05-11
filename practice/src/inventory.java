import java.util.ArrayList;

public class inventory {
    private ArrayList <product> inventory = new ArrayList<>();

    public void addProduct(product product){
        inventory.add(product);


    }
    public void display(){
        System.out.println("Inventory :");
        for (product product : inventory){
            System.out.println(product);
        }
    }
}
