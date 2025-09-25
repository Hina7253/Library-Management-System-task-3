import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void issueBook(int bookId, int userId) {
        for(Book b : books) {
            if(b.bookId == bookId && !b.isIssued) {
                for(User u : users) {
                    if(u.userId == userId) {
                        b.issueBook();
                        u.issueBook(b);
                        System.out.println("✅ Book issued: " + b.title + " to " + u.name);
                        return;
                    }
                }
            }
        }
        System.out.println("❌ Book not available or user not found!");
    }

    public void returnBook(int bookId, int userId) {
        for(Book b : books) {
            if(b.bookId == bookId && b.isIssued) {
                for(User u : users) {
                    if(u.userId == userId) {
                        b.returnBook();
                        u.returnBook(b);
                        System.out.println("✅ Book returned: " + b.title + " by " + u.name);
                        return;
                    }
                }
            }
        }
        System.out.println("❌ Book not issued or user not found!");
    }

    public void showAvailableBooks() {
        System.out.println("\n📚 Available Books:");
        for(Book b : books) {
            if(!b.isIssued) {
                System.out.println(b);
            }
        }
    }

    public void showUsers() {
        System.out.println("\n👥 Users:");
        for(User u : users) {
            System.out.println(u);
        }
    }
}
