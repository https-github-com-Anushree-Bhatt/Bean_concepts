package org.learning.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
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
}
