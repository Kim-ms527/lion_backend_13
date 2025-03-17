package com.example.swaggerexam.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal;

    @BeforeAll
    static void beforeAll(){
        System.out.println("모든 테스트 실행 전에 한 번 실행 !! ");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("모든 테스트 실행 후에 한 번 실행!!");
    }
    @BeforeEach
    void setUp() {
        System.out.println("각 테스트 메서드가 실행되기 전에 실행.");
        cal = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("각 테스트 메서드가 실행된 후 실행.");
        cal = null;
    }

    @Test
    @DisplayName("덧셈 테스트")
    void add() {
        System.out.println("add test 메서드 실행 ");
        assertEquals(7, cal.add(3,4));
        assertEquals(-1, cal.add(2,-3));

    }

    @Test
    @DisplayName("나눗셈 테스트")
    void divide(){
        assertEquals(2.0, cal.divide(6,3));
        assertEquals(-2.0, cal.divide(6,-3));
    }

    @Test
    @DisplayName("0으로 나누기 예외 테스트")
    void divideByZero(){
        assertThrows(ArithmeticException.class, ()->cal.divide(6,0));
    }


    @Test
    void test(){
        System.out.println("add test2 메서드 실행 ");
    }
}