package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookMain {
    public static void main(String[] args) {
//        find();
        create();
//        update();
//        delete();

    }

    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
//        em.getTransaction().begin();
        try{
            Author author = em.find(Author.class, 1L);
            log.info("지은이 이름 : "+author.getName());

            for (Book book: author.getBooks()){
                log.info("책제목 : "+ book.getTitle());
            }
//            Book book = em.find(Book.class, 1L);
//
//            log.info("Book title : "+ book.getTitle());
//
//            log.info("Author name : "+ book.getAuthor().getName());



        }finally {
            em.close();
        }
    }
    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Author author = new Author();
            author.setName("강경미");

            Book book = new Book();
            book.setTitle("모두의 자바");
            book.setAuthor(author);

            author.getBooks().add(book);

            em.persist(author);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Author author = em.find(Author.class, 3L);
            author.setName("carami");
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    private static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Author author = em.find(Author.class, 5L);
            log.info(author.getName());
//            author.getBooks().clear();
            em.remove(author);

//            Book book = em.find(Book.class,4L);
//            em.remove(book);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

}
