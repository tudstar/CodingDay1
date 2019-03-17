package model.peripherial.peripherals.mice;

import model.peripherial.peripherals.Mouse;

public class WiredMouse extends Mouse {
    public WiredMouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
    }

    public WiredMouse(String connectionToComputer, String brand, boolean hasScrollWhell) {
        super(connectionToComputer, brand, hasScrollWhell);
    }
}
