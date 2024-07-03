package org.learning.beans;

import org.learning.service.VehicleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    @Autowired
    private VehicleService vehicleService;

    public Vehicle(){
    }

    public VehicleService getVehicleServiceBean(){
        return vehicleService;
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
