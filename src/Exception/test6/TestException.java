package Exception.test6;

public class TestException extends Exception {
    String message;

    public TestException(String message) {
        this.message = message;
    }

    public void method() {
        System.out.println(message);
    }
}