package delegation.booking;

public class TrainBooking implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked");
    }
}
