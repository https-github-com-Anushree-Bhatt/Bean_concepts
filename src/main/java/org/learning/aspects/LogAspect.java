package org.learning.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LogAspect {

    private static Logger logger = Logger.getLogger(LogAspect.class.getName());

    @Around("execution(* org.learning.service.*.*(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Starting the method execution of "+joinPoint.getSignature().toString());
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant stop = Instant.now();
        Duration d = Duration.between(start,stop);
        logger.info("time taken to execute this method is:"+d.toMillis());
        logger.info("Stopping the method execution of "+joinPoint.getSignature().toString());
    }

    @AfterThrowing(value = "execution(* org.learning.service.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex){
        logger.log(Level.SEVERE,joinPoint.getSignature().toString()+": An exception thrown using @AfterThrowing and the exception is:"+ex.getMessage());
    }
    //Ex o/p : org.learning.aspects.LogAspect logStatus
    //INFO: String org.learning.service.VehicleService.moveVehicle(Boolean): method executed successfully. Using @AfterReturning, we can show you the status of method:BridgeStone Tyre moving the vehicle


    @AfterReturning(value = "execution(* org.learning.service.*.*(..))", returning = "res")
    public void logStatus(JoinPoint joinPoint, Object res){
        logger.log(Level.INFO,joinPoint.getSignature().toString()+": method executed successfully. Using @AfterReturning, we can show you the status of method:"+res.toString());
    }
    //Ex o/p: An exception thrown using @AfterThrowing and the exception is:Daamn ! It's null pointer exception
    //Exception in thread "main" java.lang.NullPointerException: Daamn ! It's null pointer exception .....
}
