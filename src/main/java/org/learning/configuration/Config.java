package org.learning.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.learning.implementations", "org.learning.service", "org.learning.aspects"})
@EnableAspectJAutoProxy
public class Config {

}
