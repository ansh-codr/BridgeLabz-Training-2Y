package assignment13;

public class Runner {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        try {
            booking.bookTicket("12A", 5000);
        } catch (SeatUnavailableException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
