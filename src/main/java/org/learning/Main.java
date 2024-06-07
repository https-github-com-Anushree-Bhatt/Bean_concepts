package org.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        context.close();

    }
}