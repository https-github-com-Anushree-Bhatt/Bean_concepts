package org.learning.beans;

import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private String name;
    private final Vehicle vehicle;

    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
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

    //when Vehicle is final , no need of setter method


}
