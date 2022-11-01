package com.bywhat;

public class Train extends Vehicle {
    public Train() {
        super();
    }

    public Train(String colour, double speed) {
        super(colour, speed);
    }

    @Override
    public String getVehicleType() {
        return "火车";
    }
}