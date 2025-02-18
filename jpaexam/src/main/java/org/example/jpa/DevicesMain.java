package org.example.jpa;

import jakarta.persistence.EntityManager;

import java.util.List;

public class DevicesMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
//  데이터 추가
//            Phone phone = new Phone();
//            phone.setBrand("Samsung");
//            phone.setPrice(100000);
//            phone.setOperatingSystem("Android");
//            phone.setBatteryLife(24);
//            em.persist(phone);
//
//            Laptop laptop = new Laptop();
//            laptop.setBrand("Apple");
//            laptop.setPrice(200000);
//            laptop.setRamSize(16);
//            laptop.setHasTouchScreen(true);
//            em.persist(laptop);
////
//
//
//            //  저장된 데이터 조회
            List<Device> devices = em.createQuery("SELECT d FROM Device d", Device.class).getResultList();
            for (Device d : devices) {
                System.out.println("Device: " + d.getBrand() + ", Price: " + d.getPrice() + ", Type: " + d.getClass().getSimpleName());

                if (d instanceof Phone p) {
                    System.out.println("  OS: " + p.getOperatingSystem() + ", Battery Life: " + p.getBatteryLife() + " hours");
                } else if (d instanceof Laptop l) {
                    System.out.println("  RAM: " + l.getRamSize() + "GB, Touch Screen: " + l.isHasTouchScreen());
                }
            }

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

}
