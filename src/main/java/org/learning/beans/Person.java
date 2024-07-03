package org.learning.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Person {
    private String name;
    private final Vehicle vehicle;

    public Person(Vehicle vehicle){
        System.out.println("Person bean created");
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
