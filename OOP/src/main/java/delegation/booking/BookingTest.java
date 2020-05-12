package delegation.booking;

public class BookingTest {
    public static void main(String[] args) {
        TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
        agent.bookTicket();

        agent = new TicketBookingByAgent(new AirBooking());
        agent.bookTicket();
    }
}
