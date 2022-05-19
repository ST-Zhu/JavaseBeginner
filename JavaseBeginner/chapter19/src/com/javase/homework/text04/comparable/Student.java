package com.javase.homework.text04.comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float grade;

    public Student() {
    }

    public Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.grade > o.grade) {
            return -1;
        } else if (this.grade < o.grade) {
            return 1;
        } else {
            return (this.age - o.age);
        }
    }
}
