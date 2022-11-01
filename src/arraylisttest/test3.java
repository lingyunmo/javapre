package arraylisttest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(randomString());
        }
        System.out.println("随机生成的字符串为：" + list);
        System.out.println("通过索引访问将每个字符串转换为大写");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            str = str.toUpperCase();
            list.set(i, str);
        }
        System.out.println("转换后的字符串为：" + list);
        System.out.println("通过迭代器Iterator访问将每个字符串转换为大写");
        Iterator<String> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String str = iterator.next();
            list.set(i++, str.toUpperCase());
        }
        System.out.println("转换后的字符串为：" + list);
        System.out.println("通过双向迭代器ListIterator访问将每个字符串转换为大写");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            listIterator.set(str.toUpperCase());
        }
        System.out.println("转换后的字符串为：" + list);
        System.out.println("通过调用replaceAll方法将每个字符串转换为大写");
        list.replaceAll(String::toUpperCase);
        System.out.println("转换后的字符串为：" + list);
    }

    private static String randomString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            str.append((char) (Math.random() * 26 + 'a'));
        }
        return str.toString();
    }
}