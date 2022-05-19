/*1.产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/


package com.javase.homework.text02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final int RN = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayInt = new int[RN];
        int randomInt;

        for (int i = 0; i < RN; i++) {
            do {
                randomInt = random.nextInt(101);
            }while (randomInt == 0);

            arrayInt[i] = randomInt;
        }

        List<Integer> lists = new ArrayList<>(10);
        for (int i = 0; i < RN; i++) {
            if (arrayInt[i] >= 10) {
                lists.add(arrayInt[i]);
            }
        }

        System.out.print("数组中的元素：");
        for (Integer element : arrayInt) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("链表中的元素：");
        for (Integer element : lists) {
            System.out.print(element + " ");
        }

    }
}
