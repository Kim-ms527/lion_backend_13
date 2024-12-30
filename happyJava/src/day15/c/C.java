package day15.c;

import day15.a.DBInter;

public class C implements DBInter {
    @Override
    public void dbConn() {
        System.out.println("C가 구현한 로직 실행");
    }
}
