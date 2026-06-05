class Book {
    int BookId;
    String BookName;
    String BookAuthor;
    String YearOfPub;
    float Price;
    String Status;

    Book(int BookId, String BookName, String BookAuthor, String YearOfPub, float Price, String Status) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearOfPub = YearOfPub;
        this.Price = Price;
        this.Status = Status;
    }

    void AddNewBooks() {
        System.out.println("Adding new book: " + BookName);
    }

    void DeleteBooks() {
        System.out.println("Deleting book: " + BookId);
    }

    void DisplayBookDetails() {
        System.out.println("Book ID: " + BookId);
        System.out.println("Name: " + BookName);
        System.out.println("Author: " + BookAuthor);
        System.out.println("Year: " + YearOfPub);
        System.out.println("Price: " + Price);
        System.out.println("Status: " + Status);
    }

    void InquiryBook() {
        System.out.println("Inquiring about book: " + BookName);
    }
}

class Librarian {
    int Id;
    String Name;

    Librarian(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    void SearchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    boolean VerifyMember(int id) {
        System.out.println("Verifying member: " + id);
        return true;
    }

    void OrderBooks() {
        System.out.println("Ordering books.");
    }

    void SellBooks() {
        System.out.println("Selling books.");
    }
}

class Publisher {
    int Id;
    String Name;
    String Address;
    int PhoneNo;

    Publisher(int Id, String Name, String Address, int PhoneNo) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
    }

    void AddPub() {
        System.out.println("Adding publisher: " + Name);
    }

    void ModifyPub() {
        System.out.println("Modifying publisher details.");
    }

    void DeletePub() {
        System.out.println("Deleting publisher: " + Id);
    }

    void OrderStatus() {
        System.out.println("Checking order status.");
    }
}

class User {
    int UserID;
    String UserName;
    String UserAddress;
    int PhoneNo;

    User(int UserID, String UserName, String UserAddress, int PhoneNo) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.UserAddress = UserAddress;
        this.PhoneNo = PhoneNo;
    }

    void ReturnBooks() {
        System.out.println("Returning books.");
    }

    int PayFine(String Dt) {
        System.out.println("Paying fine on date: " + Dt);
        return 10;
    }

    void AddNewUser() {
        System.out.println("Adding new user: " + UserName);
    }

    void DeleteUser() {
        System.out.println("Deleting user: " + UserID);
    }

    void UpdateDetails() {
        System.out.println("Updating user details.");
    }

    void BookPurchase() {
        System.out.println("Purchasing book.");
    }
}

public class BookScenerio {
    public static void main(String[] args) {
        Book b = new Book(1, "Java", "Author", "2020", 500, "Available");
        b.DisplayBookDetails();
        b.AddNewBooks();

        Librarian l = new Librarian(101, "Joynal");
        l.SearchBook("Java");
        System.out.println("Member verified: " + l.VerifyMember(202));

        Publisher p = new Publisher(201, "TechPub", "NYC", 01234567);
        p.AddPub();

        User u = new User(301, "Ruma", "123 St", 19876);
        u.AddNewUser();
        u.BookPurchase();
        u.ReturnBooks();
        u.PayFine("2025-06-05");
    }
}
