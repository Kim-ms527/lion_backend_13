package com.example.springdatajpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    //이름을 기준으로 조회하고 싶어요.  어떻게 메서드를 정의하면 될까요?
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findByNameContaining(String name); //select * from jpa_user where name like %name%
    List<User> findByNameAndEmail(String name, String email);
    List<User> findByNameOrEmail(String name, String email);

    //select * from user where name = name and email = email
    //select * from user where create_at Between start and end ;
    //jpql  vs  sql   --   차이점
    //jpql --  대상 : 엔티티
    //sql  --  대상 : table
    @Query("SELECT u FROM User u WHERE u.name = :name")
    List<User> selectUser(@Param("name")String name);
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> selectUserLike(@Param("name") String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM User u WHERE u.email = :email")
    int deleteByEmail(@Param("email")String email);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.email = :email WHERE u.id=:id")
    int updateByEmail(@Param("id")Long id, @Param("email")String email);


    @Query(nativeQuery = true, value = "SELECT * FROM jpa_user WHERE email like %:email%")
    List<User> selectByEmailNative(@Param("email")String email);

    @Query(value = "SELECT * FROM jpa_user WHERE email like %?1%", nativeQuery = true)
    List<User> selByEmail(String email);

    List<User> findByNameContaining(String name, Pageable pageable);
}
