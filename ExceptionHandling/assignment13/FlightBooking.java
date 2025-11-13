package assignment13;

public class FlightBooking {
    public void checkSeatAvailability(String seatNumber) throws SeatUnavailableException {
        if (Math.random() < 0.5) {
            throw new SeatUnavailableException("Seat unavailable: " + seatNumber);
        }
    }

    public void processPayment(double amount) throws PaymentFailedException {
        if (Math.random() < 0.5) {
            throw new PaymentFailedException("Payment processing failed");
        }
    }

    public void bookTicket(String seatNumber, double amount) throws Exception {
        checkSeatAvailability(seatNumber);
        processPayment(amount);
        System.out.println("Ticket booked successfully");
    }
}
