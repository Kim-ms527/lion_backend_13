package org.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class VehicleMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try{
//            Car car = new Car();
//            car.setManufacturer("samsung");
//            car.setSeatCount(5);
//            em.persist(car);
//            Truck truck = new Truck();
//            truck.setManufacturer("KIA");
//            truck.setPayloadCapacity(15.5);
//            em.persist(truck);

            Vehicle vehicle = em.find(Vehicle.class, 3L);

            if(vehicle instanceof Car) {
                log.info(vehicle.getManufacturer());
                log.info(((Car) vehicle).getSeatCount() + "");
            }if(vehicle instanceof Truck){

                log.info(vehicle.getManufacturer());
                log.info(((Truck) vehicle).getPayloadCapacity() + "");
            }



            //jpql
            List<Vehicle> vehicles = em.createQuery("select v from Vehicle v",Vehicle.class).getResultList();
            for(Vehicle vehicle1: vehicles){
                if(vehicle1 instanceof Car){
                    Car car = (Car)vehicle1;
                    log.info(car.getManufacturer() +":::"+car.getSeatCount());
                }else {
                    Truck truck = (Truck) vehicle1;
                    log.info(truck.getManufacturer() +":::"+truck.getPayloadCapacity());
                    log.info(truck.getPayloadCapacity()+"");
                }
            }

            List<Object[]> results = em.createQuery("SELECT v.id, v.manufacturer, TYPE(v) FROM Vehicle v")
                    .getResultList();

            for (Object[] result : results) {
                System.out.println("ID: " + result[0] + ", Manufacturer: " + result[1] + ", Type: " + result[2]);
            }

            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
