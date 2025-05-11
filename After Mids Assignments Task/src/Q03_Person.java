public abstract class Q03_Person {
    private String name ;

    public Q03_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isOutstanding();

    public void display(){
        System.out.println("Name : "+name);
    }
}
