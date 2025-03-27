public class LibraryItem {
    private String title, pDate;
    private boolean availability;

    public LibraryItem(String title, String pDate) {
        this.title = title;
        this.pDate = pDate;
        this.availability = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public boolean isAvailability() {
        return availability;
    }




    public void displayInfo(){
        System.out.println("Title : '"+title+"'" +"\nPublication Date : "+pDate+"\nAvaiability : "+availability);
    }
}
