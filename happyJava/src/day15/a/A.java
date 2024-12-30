package day15.a;

import day15.b.B;

public class A {
    // A -> B 에게 의존관계   (수정전)
//    public void a(B b){
//        b.b();
//    }

    //B -> A  의존관계 역전 (수정 후)
    public void a(DBInter dbInter){
        dbInter.dbConn();
    }
}

//a 패키지는 b 패키지에 의존하고 있는못브이 보이나요?
