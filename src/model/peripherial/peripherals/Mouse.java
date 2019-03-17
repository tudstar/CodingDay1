package model.peripherial.peripherals;

import model.peripherial.Peripherial;

public class Mouse extends Peripherial {

    private boolean HasScrollWhell;

    public Mouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
        this.HasScrollWhell = false;
    }

    public Mouse(String connectionToComputer, String brand, boolean hasScrollWhell) {
        super(connectionToComputer, brand);
        HasScrollWhell = hasScrollWhell;
    }

    public boolean isHasScrollWhell() {
        return HasScrollWhell;
    }

    public void setHasScrollWhell(boolean hasScrollWhell) {
        HasScrollWhell = hasScrollWhell;
    }

    @Override
    public String displayDetails() {
        String toReturn = "I am a peripherial";
        if (this instanceof Mouse) {
            toReturn += "of type mouse with" + this.getConnectionToComputer()
                    + "connection made by" + this.getBrand() + " and I have a wheel? "
                    + ((Mouse) this).isHasScrollWhell();
        }
        return toReturn;
    }
}

