public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,3,"blue");
        System.out.println(p1.area());
        p1.translate(3,2);
        System.out.println(p1);

        Circle c1 = new Circle(3,4,"yellow",5);
        Circle c2 = new Circle(5,6,"green",6);
        System.out.println(c1);
        c2.scale(3);
        System.out.println(c2);
        Circle c3= c1.merge(c2);
        System.out.println(c3);

        Circle[] array = {c1,c2,c3};
        translateAll(array,3,2);
        for (int i =0 ;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    public static void translateAll(Circle circles[],int dx ,int dy){
        for(int i = 0;i < circles.length;i++){
            Circle c = circles[i];
            c.translate(dx,dy);
        }
    }
}
