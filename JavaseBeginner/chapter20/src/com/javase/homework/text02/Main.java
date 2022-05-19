/*1、请使用序列化和反序列化机制，完成学生信息管理系统。

系统打开时显示以下信息：
44欢迎使用学生信息管理系统，请认真阅读以下使用说明：
请输入不同的功能编号来选择不同的功能：
[1]查看学生列表
[2]保存学生
[3]删除学生
[4]查看某个学生详细信息

--------------------------------------------------------------------
学生信息列表展示
学号			姓名			性别
------------------------------------
1				zhangsan		男
2				lisi			女
.....

--------------------------------------------------------------------
查看某个学生详细信息
学号：1
姓名：张三
生日：1990-10-10
性别：男
邮箱：zhangsan@123.com

---------------------------------------------------------------------
删除学生时，需要让用户继续输入删除的学生编号，根据编号删除学生。


注意：请使用序列化和反序列化，以保证关闭之后，学生数据不丢失。
学生数据要存储到文件中。


*/


package com.javase.homework.text02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Manager manager = null;
        try {
            manager = new Manager();
            System.out.println("欢迎使用学生信息管理系统，请认真阅读以下使用说明：");
            Scanner scanner = new Scanner(System.in);
            int flag = -1;
            while (flag != 0) {
                System.out.println("==============================================");
                System.out.println("请输入不同的功能编号来选择不同的功能：\n" +
                        "[0]退出系统\n" +
                        "[1]查看学生列表\n" +
                        "[2]保存学生\n" +
                        "[3]删除学生\n" +
                        "[4]查看某个学生详细信息");
                System.out.print("功能编号：");
                flag = scanner.nextInt();
                manager.chooseFunction(flag);
            }

            manager.getObjectOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (manager.getObjectOutputStream() != null) {
                try {
                    manager.getObjectOutputStream().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (manager.getObjectInputStream() != null) {
                try {
                    manager.getObjectInputStream().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




        /*TreeMap<Integer, Student> treeMap = new TreeMap<>();
        Student student1 = new Student(1, "zhangsan", true);
        Student student2 = new Student(2, "lisi", false);
        treeMap.put(student1.getNumber(),student1);
        treeMap.put(student2.getNumber(),student2);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("chapter20/src/com/javase/homework/text02/student"));
            oos.writeObject(treeMap);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }
}
