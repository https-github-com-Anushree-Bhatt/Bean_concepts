package org.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Toyota");
        return v;
    }

    @Bean
    Person person(Vehicle vehicle){
        Person p = new Person();
        p.setName("Anu");
        p.setVehicle(vehicle);
        return p;
    }

}
