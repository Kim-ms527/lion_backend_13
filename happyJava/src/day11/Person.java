package day11;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String idNumber; //주민번호
    private String name;
    private String phoneNumber;
    private String address;

    public Person(){

    }

    public Person(String idNumber, String name, String phoneNumber, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getIdNumber(), person.getIdNumber()) && Objects.equals(getName(), person.getName()) && Objects.equals(getPhoneNumber(), person.getPhoneNumber()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdNumber(), getName(), getPhoneNumber(), getAddress());
    }

    @Override
    public int compareTo(Person o) {
        return this.idNumber.compareTo(o.idNumber);
    }
}
