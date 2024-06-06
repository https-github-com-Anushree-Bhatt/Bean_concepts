package org.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
//        var vehicle = context.getBean(Vehicle.class); --> Primary annotation
        var vehicle = context.getBean("audi",Vehicle.class);
        System.out.println(vehicle.getName());

        var welcome_str = context.getBean(String.class);
        System.out.println(welcome_str);

        var age = context.getBean("age");
        System.out.println(age);
    }
}