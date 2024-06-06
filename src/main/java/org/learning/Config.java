package org.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    Vehicle vehicle1(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }
    @Primary
    @Bean
    Vehicle vehicle2(){
        Vehicle v = new Vehicle();
        v.setName("BMW");
        return v;
    }
    @Bean
    String helloWorld(){
        return "Hello world!!";
    }
    @Bean
    Integer age(){
        return 16;
    }
}
