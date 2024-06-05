package org.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
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
