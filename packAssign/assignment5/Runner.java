import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Runner {
    public static void main(String[] args) {
        Book b = new Book("java 101", "joe");
        Member m = new Member("mona");
        Transaction t = new Transaction(b, m);
        t.issue();
    }
}
