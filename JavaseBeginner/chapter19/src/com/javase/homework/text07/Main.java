/*6.定义一个泛型为String类型的List集合，统计该集合中每个字符
（注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/

package com.javase.homework.text07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(10);
        arrayList.add("abc");
        arrayList.add("xyz");
        arrayList.add("cba");
        arrayList.add("xxx");
        arrayList.add("yy");
        arrayList.add("zz");

        for (String element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("a = " + charCount(arrayList, 'a'));
        System.out.println("b = " + charCount(arrayList, 'b'));
        System.out.println("c = " + charCount(arrayList, 'c'));
        System.out.println("x = " + charCount(arrayList, 'x'));
        System.out.println("y = " + charCount(arrayList, 'y'));
        System.out.println("z = " + charCount(arrayList, 'z'));
    }

    public static int charCount (List<String> list, char c) {
        int count = 0;
        String str;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            while (str.indexOf(c) != -1) {
                count ++;
                str = str.substring(str.indexOf(c) + 1);
            }
        }
        return count;
    }
}
