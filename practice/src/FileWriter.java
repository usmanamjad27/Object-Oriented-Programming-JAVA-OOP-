public class FileWriter {
private String name;

    public FileWriter(String name) {
        this.name = name;
    }
    public void write(String write){
        String file = write;
        System.out.println(file);
    }
    public void close(){
        System.out.println("Stop writing");
    }

}
