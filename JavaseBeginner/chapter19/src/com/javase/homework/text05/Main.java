/*4. 现在有一个map集合如下：
Map<Integer,String> map = new HashMap<Integer, String>();
map.put(1, "张三丰");
map.put(2, "周芷若");
map.put(3, "汪峰");
map.put(4, "灭绝师太");
要求：
	1.遍历集合，并将序号与对应人名打印。
	2.向该map集合中插入一个编码为5姓名为郭靖的信息
	3.移除该map中的编号为1的信息
	4.将map集合中编号为2的姓名信息修改为"周林"*/

package com.javase.homework.text05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Set<Map.Entry<Integer, String>> hashNodes = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterators = hashNodes.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }

        System.out.println("====================");

        map.put(5, "郭靖");
        Set<Integer> hashKeys = map.keySet();
        for (Integer element : hashKeys) {
            System.out.println(element + "=" + map.get(element));
        }

        System.out.println("====================");

        map.remove(1);
        Set<Map.Entry<Integer, String>> hashNodes2 = map.entrySet();
        for (Map.Entry<Integer, String> element : hashNodes2) {
            System.out.println(element);
        }

        System.out.println("====================");

        map.replace(2, "周林");
        Set<Integer> hashKeys2 = map.keySet();
        Iterator<Integer> iterators2 = hashKeys2.iterator();
        while (iterators2.hasNext()) {
            int iteratorsNext = iterators2.next();
            System.out.println(iteratorsNext + "=" + map.get(iteratorsNext));
        }
    }
}
