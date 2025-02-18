package org.example.jpa;

import jakarta.persistence.EntityManager;

public class CompanyMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Company company = new Company();
            company.setName("lion company");
            Address address = new Address();
            address.setStreet("siksa");
            address.setCity("goyang");
            address.setCountry("korea");
            address.setZipCode("12433");
            company.setAddress(address);

            em.persist(company);

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
