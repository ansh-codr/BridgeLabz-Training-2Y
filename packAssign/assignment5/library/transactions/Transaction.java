package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    
    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }
    
    public void issue() {
        System.out.println(member.getName() + " got " + book.getTitle());
    }
}
