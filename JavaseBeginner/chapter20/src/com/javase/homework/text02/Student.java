package com.javase.homework.text02;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -3885346586895933228L;
    private int number;
    private String name;
    private boolean sex;

    public Student() {
    }

    public Student(int number, String name, boolean sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
