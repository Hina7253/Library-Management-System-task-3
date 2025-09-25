import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        // Some default data
        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "OOP Concepts", "Bjarne Stroustrup"));
        lib.addBook(new Book(3, "Data Structures", "Robert Lafore"));

        lib.addUser(new User(101, "Hina"));
        lib.addUser(new User(102, "Yuvraj"));

        int choice;
        do {
            System.out.println("\n=== 📖 Library Management System ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Add Book");
            System.out.println("6. Add User");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    lib.showAvailableBooks();
                    break;
                case 2:
                    lib.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int bId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int uId = sc.nextInt();
                    lib.issueBook(bId, uId);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    bId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    uId = sc.nextInt();
                    lib.returnBook(bId, uId);
                    break;
                case 5:
                    System.out.print("Enter Book ID: ");
                    bId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(bId, title, author));
                    System.out.println("✅ Book added successfully!");
                    break;
                case 6:
                    System.out.print("Enter User ID: ");
                    uId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    lib.addUser(new User(uId, name));
                    System.out.println("✅ User added successfully!");
                    break;
                case 0:
                    System.out.println("👋 Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        } while(choice != 0);

        sc.close();
    }
}
