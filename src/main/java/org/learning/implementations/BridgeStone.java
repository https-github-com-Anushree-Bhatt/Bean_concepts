package org.learning.implementations;

import org.learning.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tyre {
    @Override
    public String rotate() {
        return "BridgeStone Tyre moving the vehicle";
    }
}
