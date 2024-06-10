package org.learning;

public class Person {
    private String name;
    private Vehicle vehicle;
    public Person() {
        System.out.println("Person is created....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}
