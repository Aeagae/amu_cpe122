public class Clerk extends Employee{
    public Clerk(int id, String name, String department, double salary, String desingation) {
        super(id, name, department, salary, desingation);
    }
    @Override
    public void addBonus(){
        this.setSalary(this.getSalary() + 100);
    }
    
}
