package com.bywhat;

public class Main {
    public static void main(String[] args) {
        methodA(new Airplane("红色", 5));
        methodA(new Automobile("蓝色", 10));
        methodA(new Train("黄色", 20));
    }

    private static void methodA(Vehicle m1) {
        Thread m2 = m1.move();
        funcA();
        m1.speedUp();
        funcA();
        m1.stop(m2);
        m1.introduce();
    }

    private static void funcA() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}