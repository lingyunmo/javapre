package reflect;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflect.Test");
        Method method = clazz.getDeclaredMethod("setAge", int.class);
        Object obj = clazz.newInstance();
        method.setAccessible(true);
        method.invoke(obj, 18);
        Method method1 = clazz.getDeclaredMethod("getAge");
        method1.setAccessible(true);
        System.out.println(method1.invoke(obj));
    }
}
