public class Triangle {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }
    public Triangle(){
        this.base = 1;
        this.height = 1;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public String toString() {
        return "base: " + base + ", height: " + height;
    }
    public boolean equals(Triangle c) {
        return base==c.base&&height==c.height;
    }
    public double Area(){
        return height*base/2;
    }
    public Triangle tripleBase(){
        base = base*3;
        return this;
    }
}
