/*
 * An example of constructor chaining
 * 
 * Also an example of the copy constructor
 */
public class E10Book {

    private String title;
    private String author;
    private String ISBN;
    private int rating;

    public E10Book() {
        title = "Unknown";
        author = "Unknown";
        ISBN = "Unknown";
        rating = -1;
    }

    public E10Book(String title) {
        this();
        this.title = title;
    }

    public E10Book(String title, String author) {
        this(title);
        this.author = author;
    }

    public E10Book(String title, String author, String ISBN) {
        this(title, author);
        this.ISBN = ISBN;
    }

    public E10Book(String title, String author, String ISBN, int rating) {
        this(title, author, ISBN);
        this.rating = rating;
    }

    public E10Book(E10Book book) {
        this.title = book.title;
        this.author = book.author;
        this.ISBN = book.ISBN;
        this.rating = book.rating;
    }

}
