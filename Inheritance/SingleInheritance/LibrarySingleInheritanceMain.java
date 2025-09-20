// Single Inheritance Sample 1: Library Management with Books and Authors
// NOTE: This models Author as a subclass of Book as per the task, though in real systems a Book "has-an" Author.

class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }
}

class Author extends Book { // per instructions; see note above
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " (" + getPublicationYear() + ")");
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibrarySingleInheritanceMain {
    public static void main(String[] args) {
        Author a = new Author("Clean Code", 2008, "Robert C. Martin", "Also known as Uncle Bob, software engineer and author.");
        a.displayInfo();
    }
}
