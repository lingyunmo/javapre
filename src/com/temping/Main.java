package com.temping;

import java.util.Scanner;
import java.util.function.IntFunction;

class Stu {
    final int a;
    int b;

    Stu(int a) {
        this.a = a;
    }
}

class Cat extends Animal {

    public Cat(String myName, int myId) {
        super(myName, myId);
    }

    @Override
    public boolean introduction() {
        System.out.println("wo是浑源兴义太极门掌门人" + super.getName() + "号" + super.getId() + ".");
        super.introduction();
        return false;
    }
}

class XiaoMain extends Cat {
    public XiaoMain(String myName, int myId) {
        super(myName, myId);
    }

    public void small() {
        System.out.println("我是小猫");
        System.out.println(super.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("兔子");
        Animal R = new Cat("猫猫", 4);
        Stu stu = new Stu(5);
        int c = stu.a;
        stu.b = c > 5 ? 1 : 2;
        R.sleep();
        R.eat();
        R.introduction();
        XiaoMain Test = new XiaoMain("小猫", 5);
        Test.small();
        Scanner sc = new Scanner(System.in);
        stu.b = sc.nextInt();
        sc.close();
        IntFunction<Integer> hh = (int e) -> {
            e = 1;
            return e * 3;
        };
        System.out.println(hh);
        System.out.println(R.method1());
        Penguin Mike = new Penguin();
        System.out.println(Mike.method1());
        System.out.println(Mike.introduction());
    }
}