package delegation.booking;

public class TicketBookingByAgent implements TravelBooking {

    TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking travelBooking){
        this.travelBooking = travelBooking;
    }


    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
