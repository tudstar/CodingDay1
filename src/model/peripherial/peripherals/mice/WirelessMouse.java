package model.peripherial.peripherals.mice;

import model.peripherial.peripherals.Mouse;

public class WirelessMouse extends Mouse {
    public WirelessMouse(String connectionToComputer, String brand) {
        super(connectionToComputer,"wireless"+ brand);
    }

    public WirelessMouse(String connectionToComputer, String brand, boolean hasScrollWhell) {
        super(connectionToComputer, brand, hasScrollWhell);

    }
}
