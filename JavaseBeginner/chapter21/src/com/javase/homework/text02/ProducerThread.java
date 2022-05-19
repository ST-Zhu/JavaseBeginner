package com.javase.homework.text02;

public class ProducerThread implements Runnable {
    Num num;

    public ProducerThread(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.getNum() < 1000 - 1) {
            synchronized (num) {
                if (num.getNum() % 2 != 0) {
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
