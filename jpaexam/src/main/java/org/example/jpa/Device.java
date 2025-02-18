package org.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter@Setter
//Single_talbe 전략
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "device_type",discriminatorType = DiscriminatorType.STRING)
//@Table(name = "DEVICES_SINGLE")

//Joined
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "DEVICES_JOIN")

//table_per_class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "devices_table")
public class Device {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String brand;
    private int price;
}
@Entity
//@DiscriminatorValue("PHONE")
//@Table(name = "PHONE_SINGLE")

//@Table(name = "PHONE_JOIN")
@Table(name = "phone_table")
@Getter@Setter
class Phone extends Device {
    private String operatingSystem;
    private int batteryLife;

}
@Entity
//@DiscriminatorValue("LAPTOP")
//@Table(name = "LAPTOP_SINGLE")
//@Table(name = "LAPTOP_JOIN")
@Table(name = "laptop_table")
@Getter@Setter
class Laptop extends Device {
    private int ramSize;
    private boolean hasTouchScreen;
}


