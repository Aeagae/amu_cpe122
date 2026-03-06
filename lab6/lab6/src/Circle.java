public class Circle extends Point {
    private int radius;
    public Circle(int x, int y,String color, int radius) {
        super(x,y,color);
        this.radius = radius;
    }
    Circle(Circle c){
        super(c);
        this.radius = c.radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public boolean equals (Circle c){
        return radius == c.radius && super.equals(c);
    }
    public String toString(){
        return super.toString() + " radius: " + radius;
    }
    public double area(Circle c){
        return Math.PI * c.radius * c.radius;
    }
    public void scale (int scale){
        this.radius = this.radius * scale;
    }
    public Circle merge(Circle c){
        double dx = c.getX() - this.getX();
        double dy = c.getY() - this.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        int newRadius = (int) (this.radius + distance);
        return new Circle(c.getX(),c.getY(),c.getColor(),newRadius);
    }


}
