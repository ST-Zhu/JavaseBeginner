/*[1]查看学生列表
[2]保存学生
[3]删除学生
[4]查看某个学生详细信息*/

package com.javase.homework.text02;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Manager {
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    TreeMap<Integer, Student> studentInformation;

    public Manager() throws IOException, ClassNotFoundException {
        File file = new File("chapter20/src/com/javase/homework/text02/student");
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
        objectInputStream = new ObjectInputStream(new FileInputStream(file));
        studentInformation = (TreeMap<Integer, Student>) objectInputStream.readObject();
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

    }

    public ObjectOutputStream getObjectOutputStream() {
        return objectOutputStream;
    }

    public void setObjectOutputStream(ObjectOutputStream objectOutputStream) {
        this.objectOutputStream = objectOutputStream;
    }

    public ObjectInputStream getObjectInputStream() {
        return objectInputStream;
    }

    public void setObjectInputStream(ObjectInputStream objectInputStream) {
        this.objectInputStream = objectInputStream;
    }

    public TreeMap<Integer, Student> getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(TreeMap<Integer, Student> studentInformation) {
        this.studentInformation = studentInformation;
    }

    public void showStudentInformation() throws IOException, ClassNotFoundException {
        System.out.println("==============================================");
        System.out.println("学生信息列表查询结果：");

        if (studentInformation.size() == 0) {
            System.out.println("学生信息列表中无数据。");
        } else {
            Set<Map.Entry<Integer, Student>> nodes = studentInformation.entrySet();
            for (Map.Entry<Integer, Student> element : nodes) {
                System.out.println(element);
            }
        }

        System.out.println("学生信息列表查询成功。");
    }

    public void addStudent() throws IOException {
        System.out.println("==============================================");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("请输入需要添加的学生学号：");
        student.setNumber(scanner.nextInt());
        System.out.print("请输入需要添加的学生姓名：");
        student.setName(scanner.next());
        System.out.print("请输入需要添加的学生性别：");
        student.setSex(scanner.nextBoolean());

        studentInformation.put(student.getNumber(), student);
        System.out.println("学生信息添加成功：" + student);
    }

    public void deleteStudent() throws IOException, ClassNotFoundException {
        System.out.println("==============================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要删除的学生学号：");
        int number = scanner.nextInt();

        studentInformation.remove(number);
        System.out.println("学生信息删除成功：" + studentInformation.get(number));
    }

    public void selectStudent() throws IOException, ClassNotFoundException {
        System.out.println("==============================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要查询的学生学号：");
        int number = scanner.nextInt();

        Student s = studentInformation.get(number);
        if (s == null) {
            System.out.println("无此学生信息。");
        } else {
            System.out.println("学生信息查询成功：" + s);
        }
    }

    public void chooseFunction(int no) throws IOException, ClassNotFoundException {
        switch (no) {
            case 0 :
                objectOutputStream.writeObject(studentInformation);
                break;
            case 1 :
                showStudentInformation();
                break;
            case 2 :
                addStudent();
                break;
            case 3 :
                deleteStudent();
                break;
            case 4 :
                selectStudent();
                break;
        }
    }
}
