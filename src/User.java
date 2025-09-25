import java.util.ArrayList;

public class User {
    int userId;
    String name;
    ArrayList<Book> issuedBooks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book b) {
        issuedBooks.add(b);
    }

    public void returnBook(Book b) {
        issuedBooks.remove(b);
    }

    public String toString() {
        return userId + " - " + name + " (Books issued: " + issuedBooks.size() + ")";
    }
}
