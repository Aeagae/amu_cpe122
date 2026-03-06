public class Point {
    private int x;
    private int y;
    private String color;
    public Point() {
        x = 1;
        y = 1;
        color = "red";
    }
    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
        this.color=p.color;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "x: "+x+" y: "+y+" color: "+color;
    }
    public boolean equals (Point p){
        return x == p.x && y == p.y && color == p.color;
    }
    public int area(){
        return 0;
    }
    public void translate(int dx , int dy){
    this.x = this.x + dx;
    this.y = this.y + dy;
    }
}
