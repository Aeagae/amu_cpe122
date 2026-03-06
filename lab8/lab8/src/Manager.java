public class Manager extends Employee{
    public Manager(int id, String name, String department, double salary, String desingation) {
        super(id, name, department, salary, desingation);
    }
    public void setDepartment(String department) {
        super.setDepartment(department);
    }
    public String getDepartment() {
        return super.getDepartment();
    }
    @Override
    public void addBonus(){
        this.setSalary(this.getSalary() + 500);
    }
}
