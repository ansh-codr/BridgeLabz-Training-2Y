public class MainLevel2 {
    public static void main(String[] args) {
        // Student Report
        Student s = new Student("Riya", 21, 86.5);
        s.displayDetails();

        System.out.println();
        // Bank Account (ATM)
        BankAccount ba = new BankAccount("Aman", "ACC-2001", 1000);
        ba.deposit(500);
        System.out.println("Withdraw 1800? " + ba.withdraw(1800));
        System.out.println("Withdraw 700? " + ba.withdraw(700));
        ba.displayBalance();

        System.out.println();
        // Palindrome Checker
        PalindromeChecker pc = new PalindromeChecker("A man, a plan, a canal: Panama");
        pc.displayResult();

        System.out.println();
        // Movie Ticket
        MovieTicket mt = new MovieTicket("Interstellar");
        mt.bookTicket("A12", 250.0);
        mt.displayDetails();

        System.out.println();
        // Cart Item
        CartItem ci = new CartItem("Notebook", 45.5, 2);
        ci.addQuantity(3);
        ci.removeQuantity(1);
        ci.displayTotal();
    }
}