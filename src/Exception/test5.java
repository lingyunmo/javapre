package Exception;

import java.io.IOException;

public class test5 {
    public static void main(String[] args) throws IOException {
        methodB();
    }
    public static void methodA() throws IOException {
        throw new IOException("IOException");
    }
    public static void methodB() throws IOException {
        methodA();
    }
}
