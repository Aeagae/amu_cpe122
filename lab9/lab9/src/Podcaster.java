public class Podcaster extends Creator {
    private double hoursStreamed;
    public Podcaster(String name ,double hoursStreamed) {
        super(name);
        this.hoursStreamed = hoursStreamed;
    }
    @Override
    public double calculateEarnings(){
        return hoursStreamed*15;
    }
    public String toString() {
        return super.toString()+ " hours streamed: " + hoursStreamed + "Earnings" + calculateEarnings();
    }
}
