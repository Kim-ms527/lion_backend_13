package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Vehicle3Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
            Car3 car = new Car3();
            car.setId(1L);
            car.setManufacturer("222");

            em.persist(car);

            Truck3 truck3 = new Truck3();
            truck3.setId(1L);

            em.persist(truck3);

//            이거 가능할까요???


//            Car3 car = new Car3();
//            car.setManufacturer("samsung");
//            car.setSeatCount(7);
//
//            em.persist(car);
//
//           Truck3 truck = new Truck3();
//           truck.setManufacturer("def");
//           truck.setPayloadCapacity(20.0);
//           em.persist(truck);
//
//            Vehicle3 vehicle =  em.find(Vehicle3.class,  52L);
//            if(vehicle instanceof Car3){
//                Car3 car = (Car3)vehicle;
//                log.info(car.getManufacturer()+":::"+car.getSeatCount());
//            }else if(vehicle instanceof Truck3){
//                Truck3 truck = (Truck3) vehicle;
//                log.info(truck.getManufacturer()+":::"+truck.getPayloadCapacity());
//            }
//
//           Car3 car =    em.find(Car3.class,  52L);
//            log.info(car.getManufacturer()+":::"+car.getSeatCount());
//
//            em.remove(vehicle);


            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
