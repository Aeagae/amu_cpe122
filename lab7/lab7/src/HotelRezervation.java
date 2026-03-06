public class HotelReservation extends Reservation{
    private String roomType;
    private boolean breakfastIncluded;

    public HotelReservation(String name , int dayCount,String roomType, boolean breakfastIncluded) {
        super(name, dayCount);
        this.roomType=roomType;
        this.breakfastIncluded=breakfastIncluded;
    }
    public String toString() {
        return super.toString() + "\nRoom Type: " + roomType + "\nBreakfast Included: " + breakfastIncluded;
    }

    // equals method
    public boolean equals(HotelReservation h) {
        return super.equals(h) &&
                this.roomType.equals(h.roomType) &&
                this.breakfastIncluded == h.breakfastIncluded;
    }

    // extend method
    public HotelReservation extend(Reservation r) {
        return new HotelReservation(this.getName() + " & " + r.getName(), this.getDayCount() + r.getDayCount(), this.roomType, this.breakfastIncluded);
    }

}
