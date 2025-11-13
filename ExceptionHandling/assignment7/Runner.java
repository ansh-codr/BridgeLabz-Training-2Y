package assignment7;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook("User1", "Java Programming");
            library.returnBook("User1", "Data Structures");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (InvalidReturnException e) {
            System.out.println(e.getMessage());
        } catch (UserLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
