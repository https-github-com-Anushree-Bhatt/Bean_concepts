package org.learning.implementations;

import org.learning.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {
    @Override
    public String makeSound(){
        return "Sony speakers playing the track..";
    }
}
