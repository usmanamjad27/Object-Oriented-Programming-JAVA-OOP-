public class T4_Pizzaorder {
    private T4_Pizza[] pizzas;
    private int count;

    public T4_Pizzaorder( ) {
        this.pizzas = new T4_Pizza[10];
        this.count = 0;
    }
    public void addPizza(T4_Pizza pizza) {
        if (count < 10) {
            pizzas[count++] = pizza;
        } else {
            System.out.println("Order is full! Can't add more pizzas.");
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }
}
