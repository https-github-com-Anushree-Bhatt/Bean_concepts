package org.learning;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person p = context.getBean(Person.class);
        System.out.println("Vehicle that person owns is:"+p.getVehicle());
    }
}