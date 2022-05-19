package com.javase.homework.text02;

public class ConsumerThread implements Runnable {
    Num num;

    public ConsumerThread(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.getNum() < 1000) {
            synchronized (num) {
                if (num.getNum() % 2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "----->" + num.addNum());
                num.notify();
            }
        }
    }
}
