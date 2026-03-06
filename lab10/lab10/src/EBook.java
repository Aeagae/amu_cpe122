public class EBook implements Downloadable,Readable {
    String name;
    double sizeinMB;
    public EBook(String name, double sizeinMB) {
        this.name = name;
        this.sizeinMB = sizeinMB;
    }
    @Override
    public void download() {
        System.out.println("downloading " + name + " with " + sizeinMB + " MB");
    }
    @Override
    public void read() {
        System.out.println("reading " + name + " with " + sizeinMB + " MB" );
    }
}
