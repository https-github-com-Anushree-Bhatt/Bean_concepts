package org.learning;


import org.learning.beans.Person;
import org.learning.beans.Vehicle;
import org.learning.configuration.Config;
import org.learning.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Before retrieving Person Bean...");
        Person p = context.getBean(Person.class);
        System.out.println("After retrieving person bean...");

    }
}

//Op:-
//        Person bean created
//        Before retrieving Person Bean...
//        After retrieving person bean...
//So person bean is created and stored in container even before main method is executed in case of singleton - eager instantiation