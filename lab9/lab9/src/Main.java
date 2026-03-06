public class Main {
    public static void main(String[] args) {
        Vehicle [] vehicles = {new Car("audi","r8",2),
                new Motorcycle("Ducati","Monster",true),
                new Truck("Dodge","ram",20.0)};
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        sortByFuelEfficiency(vehicles);
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        Creator [] creators = {new Youtuber("Ege",100000),new Podcaster("Ceren",60),new Writer("Hasan",9)};
        for (int i = 0; i < creators.length; i++) {
            System.out.println(creators[i]);
        }
        printHighestEarning(creators);

    }
    public static void sortByFuelEfficiency(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[j].calculateFuelEfficiency() < vehicles[min].calculateFuelEfficiency()) {
                    min = j;
                }
            }
            Vehicle k = vehicles[i];
            vehicles[i] = vehicles[min];
            vehicles[min] = k;
        }
    }
    public static void printHighestEarning(Creator[] creators){
        Creator max = creators[0];
        for (int i = 0; i < creators.length; i++) {
            if (creators[i].calculateEarnings() >=max.calculateEarnings()) {
                max = creators[i];
            }
        }
        System.out.println("Highest earner creator :  "+max);
    }


}