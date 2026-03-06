public class Reservation {
    private String name;
    private int dayCount;
    public Reservation(String name, int dayCount) {
        this.name = name;
        this.dayCount = dayCount;
    }
    public Reservation(Reservation r) {
        this.name = r.name;
        this.dayCount = r.dayCount;
    }
    public String getName() {
        return name;
    }
    public int getDayCount() {
        return dayCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
    public String toString() {
        return "reservation for " + name + ": " + dayCount + " days";
    }
    public boolean equals(Reservation r) {
        return this.name.equals(r.name) && this.dayCount == r.dayCount;
    }
    public Reservation extend(Reservation r) {
        return new Reservation(this.name + " & " + r.name, this.dayCount + r.dayCount);
    }