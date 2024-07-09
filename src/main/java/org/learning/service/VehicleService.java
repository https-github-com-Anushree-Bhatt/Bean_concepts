package org.learning.service;

import org.learning.interfaces.Speaker;
import org.learning.interfaces.Tyre;
import org.learning.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {
    @Autowired
    @Qualifier(value = "bridgeStone")
    private Tyre tyre;
    private Speaker speaker;

    Logger logger = Logger.getLogger(VehicleService.class.getName());

    public VehicleService(){
        System.out.println("VehicleService bean created...");
    }

    public void playMusic(Boolean vehicleStarted, Song song){
        Instant start = Instant.now();
        logger.info("Starting the method execution");
        String music_status = null;
        if (vehicleStarted){
            music_status = speaker.makeSound(song);
            System.out.println(music_status);
        }else
            logger.log(Level.SEVERE, "Vehicle is not started to perform the execution");
        logger.info("Ending the method execution");
        Instant stop = Instant.now();
        long gap = Duration.between(start,stop).toMillis();
        logger.info("Time took to execute the method:"+gap);
    }

    public void moveVehicle(Boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("Starting the method execution");
        if(vehicleStarted){
            String status = tyre.rotate();
            System.out.println(status);
        }else {
            logger.log(Level.SEVERE, "Vehicle is not started to perform the execution");
        }
        logger.info("Ending the method execution");
        Instant stop = Instant.now();
        long gap = Duration.between(start,stop).toMillis();
        logger.info("Time took to execute the method:"+gap);
    }

    public void applyBrakes(Boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("Starting the method execution");
        String status = null;
        if(vehicleStarted){
            status = tyre.stop();
            System.out.println(status);
        }else {
            logger.log(Level.SEVERE, "Vehicle is not started to perform the execution");
        }
        logger.info("Ending the method execution");
        Instant stop = Instant.now();
        long gap = Duration.between(start,stop).toMillis();
        logger.info("Time took to execute the method:"+gap);
    }
    @Autowired
    public void setSpeaker(@Qualifier(value = "boat")Speaker speaker){
        this.speaker = speaker;
    }


}
