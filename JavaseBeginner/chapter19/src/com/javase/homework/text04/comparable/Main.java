/*3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
那在成绩排序的基础上按照年龄由小到大排序。

姓名（String）年龄（int）分数（float）
liusan			20				90.0F
lisi			22				90.0F
wangwu			20				99.0F
sunliu			22				100.0F

编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
在主函数中使用Comparable 与 Comparator分别对ArrayList进行排序.
*/

package com.javase.homework.text04.comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> treeSets = new TreeSet<>();
        treeSets.add(new Student("liusan", 20, 90.0F));
        treeSets.add(new Student("lisi", 22, 90.0F));
        treeSets.add(new Student("wangwu", 20, 99.0F));
        treeSets.add(new Student("sunliu", 22, 100.0F));

        for (Student element : treeSets) {
            System.out.println(element);
        }
    }
}
