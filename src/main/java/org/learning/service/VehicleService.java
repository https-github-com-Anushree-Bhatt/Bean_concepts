package org.learning.service;

import org.learning.interfaces.Speaker;
import org.learning.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    @Qualifier(value = "bridgeStone")
    private Tyre tyre;

    private Speaker speaker;

    public void playMusic(){
        String status = speaker.makeSound();
        System.out.println(status);
    }

    public void moveVehicle(){
        String status = tyre.rotate();
        System.out.println(status);
    }
    @Autowired
    public void setSpeaker(@Qualifier(value = "boat")Speaker speaker){
        this.speaker = speaker;
    }


}
