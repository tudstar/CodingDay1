package model.peripherial;

import model.peripherial.peripherals.Mouse;

public class Peripherial {
    private String connectionToComputer;
    private  String brand;

    public Peripherial(String connectionToComputer, String brand) {
        this.connectionToComputer = connectionToComputer;
        this.brand = brand;
    }

    public String getConnectionToComputer() {
        return connectionToComputer;
    }

    public void setConnectionToComputer(String connectionToComputer) {
        this.connectionToComputer = connectionToComputer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public  String displayDetails() {
        String toReturn = "I am a peripherial";
        if (this instanceof Mouse){
            toReturn += "of type mouse with" + this.getConnectionToComputer()
                    + "connection made by" + this.getBrand() + " and I have a wheel? "
                    + ((Mouse)this).isHasScrollWhell();
        }
    return toReturn;
    }

}
