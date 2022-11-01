class Super {
    int x, y;

    public Super() {
        System.out.println("创建父类对象");
        setXY(5, 5);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x =" + x + " y=" + y);
    }
}

class Sub extends Super {
    int x, z;

    public Sub() {
        this(10, 10);
        System.out.println("创建子类对象");
    }

    public Sub(int x, int z) {
        super();
        this.x = x;
        this.z = z;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("x =" + x + " y=" + y);
        System.out.println("super.x =" + super.x + " super.y=" + super.y);
    }
}

public class knows {
    public static void main(String[] args) {
        Sub b = new Sub();
        b.display();
    }
}
