public class professor extends student {
    private int numberOfPublications;

    public professor(double CGPA, int numberOfPublications) {
        super(CGPA);
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isoutstanding() {
        if (numberOfPublications>50)
        return super.isoutstanding();
        else
            return false;
    }
}
