package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public class CustomerMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

        try{


            //  데이터 추가
            Customer customer1 = new Customer("carami", new ContactInfo("carami@example.com", "010-1234-5678"));
            Customer customer2 = new Customer("usrtory", new ContactInfo("urstory@example.com", "010-9876-5432"));

            em.persist(customer1);
            em.persist(customer2);

            em.getTransaction().commit();

            //  데이터 조회
            List<Customer> customers = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
            for (Customer c : customers) {
                log.info("Customer: {}", c.getName());
                log.info("  Email: " + c.getContactInfo().getEmail());
                log.info("  Phone: " + c.getContactInfo().getPhoneNumber());
            }



        }finally {
            em.close();
        }
    }
}
