class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand , String model , boolean hasSideCar) {
        super(brand, model);
        this.hasSideCar = hasSideCar;
    }
    @Override
    public double calculateFuelEfficiency(){
         if (hasSideCar)
             return 5.5;
             else
                 return 3.5;
     }
    public String toString(){
        return super.toString() +" Fuel Efficiency : " +calculateFuelEfficiency();
    }
}
