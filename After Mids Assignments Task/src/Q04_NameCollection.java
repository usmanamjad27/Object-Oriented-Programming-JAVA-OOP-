public class Q04_NameCollection implements Q04_Enumeration {

    private String[] names;
    private int size; // actual number of names

    // Constructor to initialize with sample names
    public Q04_NameCollection(String[] inputNames) {
        names = new String[100];
        size = inputNames.length;

        for (int i = 0; i < size; i++) {
            names[i] = inputNames[i];
        }
    }

    // Check if there is a next name at the given index
    @Override
    public boolean hasNext(int index) {
        return index < size;
    }

    // Return the name at the given index
    @Override
    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index];
        } else {
            return null;
        }
    }
}
