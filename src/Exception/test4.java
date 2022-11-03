package Exception;

public class test4 {
    public static void main(String[] args) {
        try {
            throw new Exception("一个异常");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("程序结束");
        }
    }
}
