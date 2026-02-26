public class lab4 {
    public static void main(String[] args) {
        testCylinder();
        //testMessage();
        //testCustomer();

    }
    public static void testCylinder() {
        Cylinder cyl1 = new Cylinder();
        System.out.println("Defalt cons "+ cyl1);
        Cylinder cyl2 = new Cylinder(2,3);
        System.out.println("Parametric cons"+ cyl2);
        Cylinder cyl3 = new Cylinder(cyl2);
        System.out.println("Copy cons "+cyl3);
        Cylinder cyl4 = new Cylinder();
        cyl4.setHeight(5);
        cyl4.setRadius(10);
        System.out.println(cyl4);
        System.out.println(cyl3.getRadius()+" "+cyl3.getHeight());
        System.out.println(Cylinder.getNumberofCylinders());
        System.out.println("Volume of parametric cons "+ cyl2.Volume());
        System.out.println("Surface area of parametric cons "+ cyl2.surfacearea());
        System.out.println("test cyl2 = cyl3 "+ cyl2.equals(cyl3));
    }
    public static void testMessage(){
        Message msg1 = new Message();
        System.out.println(msg1);
        Message msg2 = new Message("hello",3);
        System.out.println(msg2);
        Message msg3 = new Message(msg2);
        System.out.println(msg3);
        System.out.println("test msg 2 = msg3 "+ msg3.equals(msg2));
        Message msg4 = new Message("merhaba",4);
        Message appendmsg = msg2.append(msg4);
        System.out.println(appendmsg);
        System.out.println("Message count"+ Message.getNumberofMessages());
    }
    public static void testCustomer(){
        Customer c1 = new Customer(12,"ege","dilmaç","egd",1234,"save",1000);
        c1.deposit(100);
        c1.withdraw(200);
        c1.setFirstName("eg");
        System.out.println(c1);
        System.out.println(c1.getFirstName());
        Customer c2=new Customer(12,"eg","dilmaç","egd",1234,"save",900);
        System.out.println("c1 = c2 "+c2.equals(c1));
        System.out.println(c2);

    }


}