package Exception.test6;

public class Main {
    public static void main(String[] args) {
        try {
            throw new TestException("一个异常");
        } catch (TestException e) {
            e.method();
        }
    }
}
