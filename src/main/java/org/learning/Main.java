package org.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Supplier<Vehicle> v1_supplier = () -> {
            Vehicle v1 = new Vehicle();
            v1.setName("Audi");
            return v1;
        };
        Vehicle v2 = new Vehicle();
        v2.setName("BMW");
        Supplier<Vehicle> v2_supplier = () -> v2;

        Random r = new Random();
        int randomNumber = r.nextInt(10);
        if(randomNumber%2==0){
            context.registerBean("audi_vehicle", Vehicle.class,v1_supplier);
        }else {
            context.registerBean("BMW_vehicle", Vehicle.class,v2_supplier);
        }
        System.out.println("The random number is :"+randomNumber);
        System.out.println("Bean created is :"+(context.getBean(Vehicle.class)).getName());
    }
}