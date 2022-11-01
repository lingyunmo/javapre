package test.seven.test72;

import java.util.Scanner;

import test.four.test42.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        System.out.println("输入半径和高");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        Cylinder c1 = new Cylinder(radius, height);
        System.out.println("圆柱面积：" + c1.getArea() + " 圆柱体积：" + c1.getVolume());
        //调用父类被重写的方法
        System.out.println("圆面积：" + ((Circle)c1).getArea() + " 圆周长：" + c1.getPerimeter());

    }
}
