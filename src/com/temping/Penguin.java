package com.temping;

public class Penguin extends Animal {
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }

    public Penguin() {
        super();
    }

    @Override
    public boolean introduction() {
        System.out.println("俺是大熊猫"         + super.getName() + "号" + super.getId() + ".");
        return false;
    }
}