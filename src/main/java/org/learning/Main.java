package org.learning;


import org.learning.beans.Person;
import org.learning.beans.Vehicle;
import org.learning.configuration.Config;
import org.learning.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("------------Demo for injecting prototype to singleton---------");
        Vehicle v1 = context.getBean(Vehicle.class);
        Vehicle v2 = context.getBean(Vehicle.class);
        System.out.println("v1,v2 Singleton scope beans ");
        System.out.println("v1 hashcode:"+v1.hashCode());
        System.out.println("v2 hashcode:"+v2.hashCode());
        System.out.println("But prototype bean vehicleService referred by v1,v2 is no more acting as a prototype");
        System.out.println("v1's vehicleService hashcode:"+v1.getVehicleServiceBean().hashCode());
        System.out.println("v2's vehicleService hashcode:"+v2.getVehicleServiceBean().hashCode());

    }
}

/*Output:-
         VehicleService bean created...
        ------------Demo for injecting prototype to singleton---------
        v1,v2 Singleton scope beans
        v1 hashcode:1878169648
        v2 hashcode:1878169648
        But prototype bean vehicleService referred by v1,v2 is no more acting as a prototype
        v1's vehicleService hashcode:1781241150
        v2's vehicleService hashcode:1781241150 */

