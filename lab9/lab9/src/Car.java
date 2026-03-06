public class Car extends Vehicle {
    private double engineSize;

    public Car(String brand,String model,double engineSize){
        super(brand,model);
        this.engineSize = engineSize;
    }
    @Override
    public double calculateFuelEfficiency(){
        return 5+engineSize;
    }
    public String toString(){
        return super.toString() +" Fuel Efficiency : " +calculateFuelEfficiency();
    }
}
