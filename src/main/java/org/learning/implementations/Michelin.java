package org.learning.implementations;

import org.learning.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyre {
    @Override
    public String rotate() {
        return "Michelin Tyre moving the vehicle";
    }
}
