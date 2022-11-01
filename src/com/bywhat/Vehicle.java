package com.bywhat;

public abstract class Vehicle implements Movable, Runnable {
    String colour;
    double speed;
    double time;

    public Vehicle() {
    }

    public Vehicle(String colour, double speed) {
        this.colour = colour;
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public abstract String getVehicleType();

    @Override
    public Thread move() {
        Thread t1 = new Thread(this);
        t1.start();
        return t1;
    }

    @Override
    public void speedUp() {
        speed++;
        System.out.println(getVehicleType() + "加速了···,当前速度为：" + speed);
    }

    @Override
    public void stop(Thread b) {
        b.interrupt();
        System.out.println(getVehicleType() + "停止了···");
    }

    public double getDistance() {
        return speed * time;
    }

    public void introduce() {
        System.out.println(getVehicleType() + "的颜色是" + colour);
        System.out.println(getVehicleType() + "移动了" + getTime() + "秒");
        System.out.println(getVehicleType() + "移动的距离为" + getDistance());
    }

    public void run() {
        time = 0;
        System.out.println(getVehicleType() + "启动了···");
        while (!(Thread.currentThread().isInterrupted())) {
            System.out.println(getVehicleType() + "移动中···,当前速度为：" + speed);
            time++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}