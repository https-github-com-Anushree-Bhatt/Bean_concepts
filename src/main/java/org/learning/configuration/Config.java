package org.learning.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.learning.implementations", "org.learning.service"})
@ComponentScan(basePackageClasses = {org.learning.beans.Person.class,org.learning.beans.Vehicle.class})
public class Config {

}
