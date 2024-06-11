package org.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    @Autowired(required = false)
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

    public final void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}
