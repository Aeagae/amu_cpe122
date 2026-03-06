public class Trip {
    public String destination;
    public int days;

    public Trip(String destination, int days) {
        this.destination = destination;
        this.days = days;
    }
    Trip(Trip t){
        this.destination = t.destination;
        this.days = t.days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public String toString(){
        return "Trip: " + destination + " " + days + " days";
    }
    public boolean equals(Trip t){
        return this.destination.equals(t.destination) && this.days == t.days;
    }
    public Trip extend(Trip t){
        destination = t.destination+" "+destination;
        days = this.days + t.days;
        return new Trip(destination,days);
    }
}
