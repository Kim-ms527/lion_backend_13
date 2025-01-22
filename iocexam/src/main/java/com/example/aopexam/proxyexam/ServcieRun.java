package com.example.aopexam.proxyexam;

public class ServcieRun {
    public static void main(String[] args) {
        Service service  = new ProxyService();

        service.perform();
    }
}
