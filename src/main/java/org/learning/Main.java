package org.learning;


import org.learning.beans.Person;
import org.learning.beans.Vehicle;
import org.learning.configuration.Config;
import org.learning.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        VehicleService v1 = context.getBean(VehicleService.class);
        VehicleService v2 = context.getBean("vehicleService", VehicleService.class);
        System.out.println("Hashcode of v1:"+(v1.hashCode()));
        System.out.println("Hashcode of v1:"+(v2.hashCode()));
        if (v1.equals(v2))
            System.out.println("VehicleService Bean is singleton scope ");
    }
}