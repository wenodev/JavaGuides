package delegation.booking;

public class AirBooking implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked");
    }
}
