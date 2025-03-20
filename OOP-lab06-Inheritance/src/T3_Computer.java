public class T3_Computer {
    protected double  storage_size , speed , memory_size ;
   protected int word_size;

    public T3_Computer(int word_size, double storage_size, double speed, double memory_size) {
        this.word_size = word_size;
        this.storage_size = storage_size;
        this.speed = speed;
        this.memory_size = memory_size;
    }
    public T3_Computer(){
        word_size = 64;
        storage_size = 512;
        speed = 3.5 ;
        memory_size = 16;
    }

    public double getStorage_size() {
        return storage_size;
    }

    public double getSpeed() {
        return speed;
    }

    public double getMemory_size() {
        return memory_size;
    }

    public int getWord_size() {
        return word_size;
    }

    // Method to display computer details
    public void displayFeatures() {
        System.out.println("Computer Specifications:");
        System.out.println("Word Size: " + word_size + "-bit");
        System.out.println("Storage Size: " + storage_size + " GB");
        System.out.println("Processor Speed: " + speed + " GHz");
        System.out.println("Memory Size: " + memory_size + " GB");
    }
}
