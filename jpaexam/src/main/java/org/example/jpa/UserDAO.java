package org.example.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAO {
    private EntityManagerFactory entityManagerFactory;

    public UserDAO(){
        entityManagerFactory = Persistence.createEntityManagerFactory("UserPU");
    }
    public void createUser(User user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }

    public void updateUser(User user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }
    public void deleteUser(User user){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.contains(user)?user : entityManager.merge(user));
            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }
    public User findUser(Long id){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(User.class,id);
        }finally {
            entityManager.close();
        }
    }
}
