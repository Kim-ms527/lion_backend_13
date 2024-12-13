package day10;

public class BookUser {
    public static void main(String[] args) {
        Book book = new Book("java");
        book.getAuthor().setName("강경미");

        book.printBookDetails();

    }
}
