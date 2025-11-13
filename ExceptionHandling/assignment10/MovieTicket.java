package assignment10;

import java.util.HashMap;

public class MovieTicket {
    private HashMap<Integer, Boolean> seats = new HashMap<>();

    public MovieTicket() {
        for (int i = 1; i <= 50; i++) {
            seats.put(i, true);
        }
    }

    public void bookSeat(int seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Invalid seat number: " + seatNumber);
        }
        if (!seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat already booked: " + seatNumber);
        }
        seats.put(seatNumber, false);
        System.out.println("Seat " + seatNumber + " booked successfully");
    }
}
