package test.seven.test74;

public class Square extends Shape{
    double length;
    double weight;

    @Override
    public double getArea() {
        return length * weight;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + weight);
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 3;
        s1.weight = 4;
        System.out.println("面积：" + s1.getArea() + " 周长：" + s1.getPerimeter());
    }
}
