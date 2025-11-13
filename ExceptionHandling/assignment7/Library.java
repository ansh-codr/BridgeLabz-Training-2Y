package assignment7;

import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private HashMap<String, Boolean> books = new HashMap<>();
    private HashMap<String, HashSet<String>> userBooks = new HashMap<>();

    public Library() {
        books.put("Java Programming", true);
        books.put("Data Structures", true);
        books.put("Algorithms", false);
    }

    public void borrowBook(String user, String bookName) throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(bookName) || !books.get(bookName)) {
            throw new BookNotAvailableException("Book not available: " + bookName);
        }
        userBooks.putIfAbsent(user, new HashSet<>());
        if (userBooks.get(user).size() >= 5) {
            throw new UserLimitExceededException("User has exceeded borrowing limit");
        }
        books.put(bookName, false);
        userBooks.get(user).add(bookName);
        System.out.println("Book borrowed successfully: " + bookName);
    }

    public void returnBook(String user, String bookName) throws InvalidReturnException {
        if (!userBooks.containsKey(user) || !userBooks.get(user).contains(bookName)) {
            throw new InvalidReturnException("Invalid return: Book not borrowed by user");
        }
        books.put(bookName, true);
        userBooks.get(user).remove(bookName);
        System.out.println("Book returned successfully: " + bookName);
    }
}
