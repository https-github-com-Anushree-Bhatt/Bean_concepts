package org.learning;


import org.learning.configuration.Config;
import org.learning.model.Song;
import org.learning.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var v = context.getBean(VehicleService.class);
        System.out.println(v.getClass().getName());

        Song song = new Song();
        song.setTitle("How you like that!");
        song.setSinger("Black Pink");
        v.playMusic(true,song);
        System.out.println("--------------------------------");
        v.moveVehicle(true);
        System.out.println("--------------------------------");
        v.applyBrakes(true);


    }
}


