

public class T2_Book extends T2_Publication{
    private  int page_count;

    public T2_Book(String title, int price, int page_count) {
        super(title, price);
        this.page_count = page_count;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total page of the book is "+page_count);
    }
}
