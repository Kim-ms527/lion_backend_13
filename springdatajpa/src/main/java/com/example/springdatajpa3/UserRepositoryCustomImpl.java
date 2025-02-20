package com.example.springdatajpa3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom{
    private final EntityManager entityManager;
    @Override
    public List<User> findUsersByName(String name) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        Root<User> user = query.from(User.class);
        query.select(user).where(criteriaBuilder.like(user.get("name"),"%"+name+"%"));
        //select u from User u where u.name = name
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<User> findusersDynamically(String name, String email) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> user = query.from(User.class);

        List<Predicate> predicates = new ArrayList<>();
        if(name != null){
            predicates.add(cb.equal(user.get("name"), name));
        }
        if(email != null){
            predicates.add(cb.equal(user.get("email"),email));
        }

        query.select(user).where(cb.and(predicates.toArray(new Predicate[0])));
        //사용자가 입력한 값에 따라서,  쿼리가 아래처럼 동적으로 생성 될 것이다!!!
        //select u from User u ;  name = null,  email = null
        //select u from User u where u.name = name;  name != null,  email = null
        //select u from User u where u.email = email;  name = null,  email != null
        //select u from User u where u.name = name and u.email = email ;  name != null,  email != null


        //select u from User u where u.name = name or u.email = email ;

        return entityManager.createQuery(query).getResultList();
    }
}
