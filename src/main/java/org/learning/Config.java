package org.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Config {
    @Bean(name = "v1")
    @Primary
    public Vehicle vehicle1(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }
    @Bean
    public Vehicle vehicle2(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }
    @Bean
    public Vehicle vehicle3(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }
}
