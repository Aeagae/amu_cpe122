abstract class Vehicle {
    String brand ;
    String model ;

    public Vehicle(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
    public abstract double calculateFuelEfficiency();
    public String toString() {
        return "Brand : " + brand + " Model : " + model;
    }
}
