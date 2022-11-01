class Circle extends Shape {
    double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayObject() {
        System.out.println("我是圆");
        super.displayObject();
        System.out.println("直径:" + (2 * radius));
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayObject() {
        System.out.println("我是矩形");
        super.displayObject();
        System.out.println("长:" + width + " 宽:" + height);
    }
}

public class Shape {
    public double getArea() {
        return area;
    }

    double area;

    public void displayObject() {
        System.out.println("面积为：" + getArea());
    }

    public static void main(String[] args) {
        Circle c1;
        c1 = new Circle();
        c1.radius = 3;
        c1.displayObject();
        Rectangle s1;
        s1 = new Rectangle();
        s1.height = 4;
        s1.width = 3;
        s1.displayObject();
    }
}