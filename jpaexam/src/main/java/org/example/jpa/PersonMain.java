package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonMain {
    public static void main(String[] args) {
//find();
        create();
    }
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            Passport passport = em.find(Passport.class, 1L);
            log.info("여권 번호 : "+ passport.getPassportNumber());
            log.info("여권 주인 : "+ passport.getPerson().getName());

        }finally {
            em.close();
        }
    }

    private static void create(){
        EntityManager em =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Passport passport = new Passport("C1234567");
            Person person = new Person("taeyun");

            //연관관계 설정
            person.setPassport(passport);
            passport.setPerson(person);

//            em.persist(passport);
            em.persist(person);


            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
}
