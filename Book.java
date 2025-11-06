public class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showDetail() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price Rs " + price);
        System.out.println("-----------------------------");
    }

    void showDetail(String title) {
        System.out.println("Book Title: " + title);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 499.99);
        b1.showDetail();
        b1.showDetail("Python Programming");
    }
}
