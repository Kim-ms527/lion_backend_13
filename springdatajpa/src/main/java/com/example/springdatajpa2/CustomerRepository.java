package com.example.springdatajpa2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //쿼리 메서드를 추가해보고, 테스트 코드도 작성해 보세요.

    //이름으로 조회하고 싶다.
    List<Customer> findByName(String name);

    //이메일로 조회

    //이메일에 특정 문자열을 포함 하고 있는 고객 조회

    //각 고객과 고객의 주문수를 알고 싶어요.

    //고객의 세부 정보와 그 고객의 가장 최근 주문 조회를 알고 싶어요.

    //평균나이보다 많은 고객을 조회하고 싶어요.

}
