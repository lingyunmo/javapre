package com.bywhat;

public class Automobile extends Vehicle {
    public Automobile() {
        super();
    }

    public Automobile(String colour, double speed) {
        super(colour, speed);
    }

    @Override
    public String getVehicleType() {
        return "汽车";
    }
}