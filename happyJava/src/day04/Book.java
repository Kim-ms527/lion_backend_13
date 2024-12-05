package day04;

public class Book {
    String title;
    String author;
    String isbn;
    int price;
    int curruntPage;

    public void 책장을넘기다(){
        curruntPage++;
    }
    public void 책장을넘기다(int page){
        curruntPage = page;
    }
}
