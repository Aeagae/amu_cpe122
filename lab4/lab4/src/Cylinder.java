public class Cylinder {
    private double radius;
    private double height;
    private static int numberofCylinders = 0;
    public Cylinder() {
        radius = 1.0;
        height = 1.0;
        numberofCylinders++;
    }
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        numberofCylinders++;
    }


    Cylinder(Cylinder c){
        radius = c.radius;
        height = c.height;
        numberofCylinders++;
    }
    public String toString(){
       return ("Radius: "+ radius+ " Height: "+ height) ;
    }
    public boolean equals(Cylinder c) {
        return this.radius == c.radius && this.height == c.height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double setHeight(double height) {
        this.height = height;
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public static int getNumberofCylinders() {
        return numberofCylinders;
    }
    public double Volume(){
        return Math.PI * radius * radius * height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius;
    }
}
