package com.example.aopexam.proxyexam;

public class RealService implements Service{
    @Override
    public void perform() {
        System.out.println("실제 서비스에서 해야할 작업들을 구현!! ");
    }
}
