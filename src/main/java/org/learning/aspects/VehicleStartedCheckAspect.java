package org.learning.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartedCheckAspect {
    private Logger logger = Logger.getLogger(VehicleStartedCheckAspect.class.getName());

    @Before("execution(* org.learning.service.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint ,Boolean vehicleStarted) throws Throwable{
        if(!vehicleStarted)
            throw new RuntimeException("Vehicle not started");
    }
}
