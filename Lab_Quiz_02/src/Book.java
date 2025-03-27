public class Book extends Publication{
    private int pageCount;

    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total pages of the Book are "+pageCount);
    }
}
