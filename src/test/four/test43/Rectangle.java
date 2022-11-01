package test.four.test43;

public class Rectangle {
    double length;
    double width;
    public Rectangle() {
        this(1.0, 1.0);
    }
    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    double getPerimeter() {
        return 2 * (length + width);
    }
    double getArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.0, 3.0);
        System.out.println("面积：" + r1.getArea() + "周长：" + r1.getPerimeter());
        Rectangle r2 = new Rectangle();
        System.out.println("面积：" + r2.getArea() + "周长：" + r2.getPerimeter());
    }
}
