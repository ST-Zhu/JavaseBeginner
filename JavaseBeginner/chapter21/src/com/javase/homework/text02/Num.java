package com.javase.homework.text02;

public class Num {
    private int i;

    public Num(int i) {
        this.i = i;
    }

    public Num() {
    }

    public int getNum() {
        return i;
    }

    public void setNum(int i) {
        this.i = i;
    }

    public int addNum() {
        return ++i;
    }
}
