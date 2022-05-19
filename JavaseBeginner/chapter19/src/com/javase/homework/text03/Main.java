/*2.已知数组存放一批QQ号码，QQ号码最长为11位，
最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。*/


package com.javase.homework.text03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        List<String> lists = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            lists.add(strings[i]);
        }

        for (String element : lists) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i = 0; i < lists.size(); i++) {
            for (int j = (i + 1); j < lists.size(); j++) {
                if (lists.get(i).equals(lists.get(j))) {
                    lists.remove(j);
                }
            }
        }

        Iterator<String> iterators = lists.listIterator();
        while (iterators.hasNext()) {
            System.out.print(iterators.next() + " ");
        }
    }
}
