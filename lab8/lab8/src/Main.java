public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ege", "bank", 1000.0, "Employee");
        Manager m1 = new Manager(2, "ahmet", "tech", 2000.0, "manager");
        Clerk c1 = new Clerk(3,"efe","translate",500.0,"clerk");
        e1.addBonus();
        m1.addBonus();
        c1.addBonus();
        e1.display();
        m1.display();
        c1.display();
    }
}