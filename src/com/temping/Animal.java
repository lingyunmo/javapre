package com.temping;

public class Animal extends Func {
    private final String name;
    private final int id;
    public Animal(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public Animal() {
        name = "无名";
        id = 0;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public boolean introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
        return false;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }

    @Override
    public boolean method1() {
        System.out.println("我属于Animal");
        return false;
    }
}