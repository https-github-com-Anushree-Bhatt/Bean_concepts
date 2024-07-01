package org.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean(name = "v1")
    public Vehicle vehicle1(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }
    @Bean
    public Vehicle vehicle2(){
        Vehicle v = new Vehicle();
        v.setName("BMW");
        return v;
    }
    @Bean
    public Vehicle vehicle3(){
        Vehicle v = new Vehicle();
        v.setName("Scooty pep");
        return v;
    }
}
