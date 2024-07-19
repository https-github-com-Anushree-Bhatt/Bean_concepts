package org.learning.implementations;

import org.learning.interfaces.Speaker;
import org.learning.model.Song;
import org.springframework.stereotype.Component;

@Component
public class Boat implements Speaker {
    @Override
    public String makeSound(Song song){
        return "Boat speakers playing the track.....\n "+song.getTitle()+" song sung by "+song.getSinger();
    }
}
