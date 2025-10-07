// Level2 - Program 4: Movie Ticket Booking System
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Display ticket details
    public void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}