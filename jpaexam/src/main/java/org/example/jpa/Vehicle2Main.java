package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Vehicle2Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
//            Car2 car = new Car2();
//            car.setManufacturer("abc");
//            car.setSeatCount(5);
//
//            em.persist(car);

//           Truck2 truck2 = new Truck2();
//           truck2.setManufacturer("def");
//           truck2.setPayloadCapacity(20.0);
//           em.persist(truck2);

            Vehicle2 vehicle2 =  em.find(Vehicle2.class,  2L);
            if(vehicle2 instanceof Car2){
                Car2 car = (Car2)vehicle2;
                log.info(car.getManufacturer()+":::"+car.getSeatCount());
            }else if(vehicle2 instanceof Truck2){
                Truck2 truck = (Truck2) vehicle2;
                log.info(truck.getManufacturer()+":::"+truck.getPayloadCapacity());
            }


            em.remove(vehicle2);


            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
