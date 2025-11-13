package assignment10;

public class Runner {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        try {
            ticket.bookSeat(25);
            ticket.bookSeat(25);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
    }
}
