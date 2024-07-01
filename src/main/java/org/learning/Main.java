package org.learning;


import org.learning.beans.Person;
import org.learning.beans.Vehicle;
import org.learning.configuration.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person p = context.getBean(Person.class);
        Vehicle v = p.getVehicle();
        v.setName("Honda");
        System.out.println("Vehicle that person owns is:"+v);
        v.playMusic();
        v.moveVehicle();
    }
}