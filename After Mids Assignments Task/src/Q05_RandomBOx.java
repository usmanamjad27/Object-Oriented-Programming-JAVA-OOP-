import java.util.ArrayList;
import java.util.Random;

public class Q05_RandomBOx <T>{
    private ArrayList<T> items;
    private Random random;

    // Constructor
    public Q05_RandomBOx() {
        items = new ArrayList<>();
        random = new Random();
    }
    // Add item to the box
    public void add(T item) {
        items.add(item);
    }

    // Check if the box is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }
    // Draw a random item from the box
    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = random.nextInt(items.size());
        return items.get(index);
    }
}
