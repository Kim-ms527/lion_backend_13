package com.example.springmvc;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(3000);
        book.getPrice();
        book.setTitle("java");

        System.out.println(book);
    }
}
