public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, double loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public double calculateFuelEfficiency(){
        return 8+0.5*loadCapacity;
    }
    public String toString(){
        return super.toString() +" Fuel Efficiency : " +calculateFuelEfficiency();
    }
}
