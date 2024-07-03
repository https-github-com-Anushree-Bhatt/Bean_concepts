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
        System.out.println("----------------------------------------------------------------");
        System.out.println("For prototype bean vehicleService referred by v1,v2 to remain as a prototype use @Lookup");
        System.out.println("v1's vehicleService hashcode:"+v1.getVehicleServiceBean().hashCode());
        System.out.println("v2's vehicleService hashcode:"+v2.getVehicleServiceBean().hashCode());

    }
}

/*Output:-
        VehicleService bean created...
        ------------Demo for injecting prototype to singleton---------
        v1,v2 Singleton scope beans
        v1 hashcode:1355457888
        v2 hashcode:1355457888
        ----------------------------------------------------------------
        For prototype bean vehicleService referred by v1,v2 to remain as a prototype use @Lookup
        VehicleService bean created...
        v1's vehicleService hashcode:917831210
        VehicleService bean created...
        v2's vehicleService hashcode:1464555023 */

