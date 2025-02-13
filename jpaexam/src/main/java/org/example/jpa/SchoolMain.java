package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Slf4j
public class SchoolMain {
    private static final Logger log = LoggerFactory.getLogger(School.class);
    private static void find(){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        try{
            School school = entityManager.find(School.class,1L);

            log.info("School Name : {}",school.getName());

            for(Student student:school.getStudents()){
                log.info("Student name : "+student.getName());
            }
        }finally {
            entityManager.close();
        }
    }
    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            School school = new School("like school");
            
            Student student = new Student("강경미", school);
            school.getStudents().add(student);
            
            school.getStudents().add(new Student("장지현",school));
            school.getStudents().add(new Student("권태윤",school));
            school.getStudents().add(new Student("지드레곤",school));

            em.persist(school);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    public static void main(String[] args) {
//        find();
        create();
    }
}
