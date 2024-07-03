package org.learning.beans;

import org.learning.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    @Autowired
    private VehicleService vehicleService;

    public Vehicle(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        vehicleService.playMusic();
    }
    public void moveVehicle(){
        vehicleService.moveVehicle();
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
