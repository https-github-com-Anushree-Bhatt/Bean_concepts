package org.learning.implementations;

import org.learning.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class Boat implements Speaker {
    @Override
    public String makeSound(){
        return "Boat speakers playing the track..";
    }
}
