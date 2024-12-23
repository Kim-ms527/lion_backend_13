package day11;

import java.util.List;

public class BookManager {
    private static final int SEARCH_TITLE = 1;
    private static final int SEARCH_AUTHOR = 2;
    private static final int SEARCH_YEAR = 3;

    //책들을 관리 하는 클래스
    // 이 클래스가 가져야 할 필드는 무엇일까요??
    //원하는대로  List, Set, Map  으로 관리 할 수 있어요^^



    // 책을 추가 하는 기능
    public void addBook(Book book){

    }


    //책을 삭제 하는 기능
    public void removeBook(Book book){

    }

    //모든 책 정보를 보여주는 기능
    public void displayBooks(){

    }

    // 책을 조회하는 기능 (제목, 지은이, 연도.. )  findBook(int code, String query)
    public List<Book> findBook(int queryCode, String query){
        return null;
    }
    // 제목으로 조회  findBookWithTitle(String title)
    public List<Book> findBookWithTitle(String title){
        return null;
    }

    // 지은이로 조회 findBookWithAuthor(String author)
    public List<Book> findBookWithAuthor(String author){
        return null;
    }

    //출판 년도로 조회   findBookwithYear(String year)
    public List<Book> findBookwithYear(String year){
        return null;
    }
}
