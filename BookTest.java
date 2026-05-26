class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Future");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        System.out.println("Book 1:");
        book1.display();
        System.out.println();
        System.out.println("Book 2:");
        book2.display();
    }
}
