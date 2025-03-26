public class T4_Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public T4_Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int baseCost = 0;
        if (size.equalsIgnoreCase("small")) {
            baseCost = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            baseCost = 12;
        } else if (size.equalsIgnoreCase("large")) {
            baseCost = 14;
        }
        return baseCost + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
    }
    public String getDescription() {
        return "Pizza size: " + size + ", Cheese toppings: " + cheeseToppings +
                ", Pepperoni toppings: " + pepperoniToppings + ", Ham toppings: " + hamToppings +
                ", Cost: $" + calcCost();
    }
}
