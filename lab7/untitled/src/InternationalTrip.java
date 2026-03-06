public class InternationalTrip extends Trip {
    private boolean passaportRequired;
    private String currency;
    public InternationalTrip(String destination, int days, boolean passaportRequired, String currency) {
        super(destination,days);
        this.passaportRequired = passaportRequired;
        this.currency = currency;
    }
    public String toString() {
        String s = super.toString();
        s= s + "\nPassaport Required: "+passaportRequired+"\nCurrency: "+currency;
    }
    public boolean equals (InternationalTrip t) {
        return super.equals(t) && this.passaportRequired == t.passaportRequired && this.currency == t.currency;
    }
    public InternationalTrip extend(Trip t){
        return new InternationalTrip(this.getDestination()+t.getDestination(),this.getDays()+t.getDays(),this.passaportRequired,this.currency);
    }

}
