package com.bywhat;

public interface Movable {
    Thread move();

    void speedUp();

    void stop(Thread b);
}