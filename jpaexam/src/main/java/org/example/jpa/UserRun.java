package org.example.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserRun {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UserPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

 //insert
        //엔티티
//        User user = new User();
////        user.setId(2L);
//        user.setName("carami");
//        user.setEmail("carami@exam.com");
//        //엔티티가 생성  아직 영속성 컨텍스트와는 관계없는 상태. (비영속상태)
//        System.out.println("id:::"+user.getId());
//        //영속성 컨텍스트가 관리하도록 함.
//        entityManager.persist(user);  //- User   영속상태
//
//        System.out.println("id:::"+user.getId());
//
//        User user2 = new User("kim","kim@exam.com");  //  비영속 상태.
//        User user3 = new User("hobg","hong@exam.com");
//        User user4 = new User("lee","lee@exam.com");
//
//        entityManager.persist(user2);
//        entityManager.persist(user3);
//        entityManager.persist(user4);


//조회  select
//
//        //영속성 컨텍스트를 통해서 조회를 한다.
//        User user = entityManager.find(User.class, 6L);
//        User user2 = entityManager.find(User.class, 6L);
//
//        if(user == user2)
//            System.out.println("user==user2");
//        else
//            System.out.println("user != user2");


        //수정 (update)
//        User user = entityManager.find(User.class, 1L);
//        user.setName("kang");   //DB에 바로 접근해서 일하지 않아요.
//        //트랜잭션이 종료될때 까지는 영속성 컨텍스트에서만 관리해요.
//
//
//        //중간에 다른일들을 수행
//
//        User user2 = entityManager.find(User.class,1L);
//        user2.setName("carami");


        //삭제
        User user = entityManager.find(User.class,1L);
        entityManager.remove(user);




        System.out.println("transaction.commit 실행전");
        transaction.commit();   //영속성 컨텍스트를 분석해서 알맞는 동작을한다.
        System.out.println("transaction.commit 실행후");

        
    }
}
