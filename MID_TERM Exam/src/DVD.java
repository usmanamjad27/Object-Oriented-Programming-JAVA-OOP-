public class DVD extends LibraryItem {
    private Libarian libarian;
    private double duration;

    public DVD(String title, String pDate, Libarian libarian, double duration) {
        super(title, pDate);
        this.libarian = libarian;
        this.duration = duration;
    }

    public Libarian getLibarian() {
        return libarian;
    }

    public void setLibarian(Libarian libarian) {
        this.libarian = libarian;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println(libarian.display());
        System.out.println("Its movie time or duration  : "+duration+"min");
    }
}
