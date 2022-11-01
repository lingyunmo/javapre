package test.four.test44;

public class Triangle {
    double a;
    double b;
    double c;
    public Triangle() {
        this(0.0, 0.0, 0.0);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("面积：" + t1.getArea());
        Triangle t2 = new Triangle();
        System.out.println("面积：" + t2.getArea());
    }
}
