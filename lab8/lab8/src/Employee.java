public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String desingation; 

    public Employee(int id, String name, String department, double salary, String desingation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.desingation = desingation;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public String getDesingation() {
        return desingation;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDesingation(String desingation) {
        this.desingation = desingation;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return this.desingation.equals(e.desingation);
    }
    public void addBonus(){
        this.salary += 200;
    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Desingation: " + desingation);
    }
}
