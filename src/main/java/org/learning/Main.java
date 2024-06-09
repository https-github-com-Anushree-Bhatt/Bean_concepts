package org.learning;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beansConfig.xml");
        Vehicle v = context.getBean("v", Vehicle.class);
        System.out.println(v.getName());

    }
}