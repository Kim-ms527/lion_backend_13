package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeMain {
    public static void main(String[] args) {
        find();
    }
    private static void find(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        try{
            Project project = em.find(Project.class, 1L);
            log.info("프로젝트 이름 : "+project.getTitle());

            for(Employee employee : project.getEmployees()){
                log.info("사원이름 : "+ employee.getName());
            }

        }finally {
            em.close();
        }
    }
}
