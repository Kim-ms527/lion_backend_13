package day15.b;

import day15.a.DBInter;

public class B implements DBInter {
    @Override
    public void dbConn() {
        System.out.println("B 로직 실행 ");
    }
}
