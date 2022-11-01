package test.four.test42;

import test.seven.test72.Cylinder;

public class Circle {
    double centerX;
    double centerY;
    public double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        System.out.println("面积：" + c1.getArea() + "周长：" + c1.getPerimeter());
        Circle c2 = new Circle();
        System.out.println("面积：" + c2.getArea() + "周长：" + c2.getPerimeter());
    }
}
