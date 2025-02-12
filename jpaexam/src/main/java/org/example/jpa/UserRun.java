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

        //엔티티
        User user = new User();
        user.setId(2L);
        user.setName("carami");
        user.setEmail("carami@exam.com");
        //엔티티가 생성  아직 영속성 컨텍스트와는 관계없는 상태. (비영속상태)

        //영속성 컨텍스트가 관리하도록 함.
        entityManager.persist(user);  //- User   영속상태


        System.out.println("transaction.commit 실행전");
        transaction.commit();
        System.out.println("transaction.commit 실행후");

        
    }
}
