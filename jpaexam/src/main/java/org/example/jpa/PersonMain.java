package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonMain {
    public static void main(String[] args) {
//find();
//        create();
//        delete();
        update();
    }
    private static void update(){
        EntityManager em =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Person person = em.find(Person.class, 3L);
            person.setName("user");

            Passport passport = new Passport("A12345667");
            passport.setPerson(person);  //요거 없으며 포링키 값이 추가 안됨.
            person.setPassport(passport);

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
    private static  void delete(){
        EntityManager em =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{

//            Person person = em.find(Person.class, 1L);
//            em.remove(person);


            Passport passport = em.find(Passport.class, 3L);
            if(passport != null) {
                passport.getPerson().setPassport(null);
            }
            em.remove(passport);


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
            Passport passport = new Passport("C1234568");
            Person person = new Person("carami");

            //연관관계 설정
            person.setPassport(passport);
            passport.setPerson(person);

            em.persist(passport);
//            em.persist(person);


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
