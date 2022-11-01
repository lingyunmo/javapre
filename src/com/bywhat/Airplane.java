package com.bywhat;

public class Airplane extends Vehicle {
    public Airplane() {
        super();
    }

    public Airplane(String colour, double speed) {
        super(colour, speed);
    }

    @Override
    public String getVehicleType() {
        return "飞机";
    }
}