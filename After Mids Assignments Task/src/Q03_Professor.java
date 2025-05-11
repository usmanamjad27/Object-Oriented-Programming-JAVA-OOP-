public class Q03_Professor extends Q03_Person {
    private int numberOfPublications;

    public Q03_Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    @Override
    public boolean isOutstanding() {
        return numberOfPublications >= 50;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("No of Publications : "+numberOfPublications);
    }
}
