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
        VehicleService v2 = context.getBean(VehicleService.class);
        System.out.println("v1 hashcode:"+v1.hashCode());
        System.out.println("v2 hashcode:"+v2.hashCode());

    }
}

//output:
//        v1 hashcode:1878169648
//        v2 hashcode:1781241150
