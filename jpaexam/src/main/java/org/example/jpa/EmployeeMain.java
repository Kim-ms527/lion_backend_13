package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeMain {
    public static void main(String[] args) {

//        create();
//        find();
//        update();
        delete();
    }
    private static void delete(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Employee employee = em.find(Employee.class, 1L);
            em.remove(employee); //직원이 살제될 때 프로젝트와의 관계도 같이 삭제 되야할거예요..

            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }
    private static void update(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Employee employee = em.find(Employee.class, 1L);
            employee.setName("kyung mi");

            employee.getProjects().add(em.find(Project.class, 3L));

            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            Project project = em.find(Project.class, 3L);
            log.info("프로젝트 이름 : "+project.getTitle());

            for(Employee employee : project.getEmployees()){
                log.info("사원이름 : "+ employee.getName());
            }

//            Employee employee = em.find(Employee.class, 3L);
//            log.info("사원이름 : "+employee.getName()  );
//
//            for (Project project : employee.getProjects()){
//                log.info("프로젝트 명 : "+ project.getTitle());
//            }

        }finally {
            em.close();
        }
    }

    private static void create(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Employee employee = new Employee("kim");
//            employee.setName("kang");

            Project project = new Project();   //프로젝트를 새로 생성
            project.setTitle("like project");

//            Project project = em.find(Project.class, 3L);  //기존프로젝을 불러와서 사원이랑 관계맺어준거.

            employee.getProjects().add(project);
            project.getEmployees().add(employee);

            em.persist(employee);
            em.persist(project);

            em.getTransaction().commit();

        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }finally {
            em.close();
        }
    }
}
