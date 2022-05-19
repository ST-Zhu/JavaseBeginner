/*java多线程模拟实现12306售票

业务描述
	假设有200张票，用4个线程去订票，不能有两个或者以上的线程订到了
	同一个票（原因就不说了），当最后一张票卖掉的时候结束，再订就抛
	异常提示出票卖完了。

业务分析,要实现以上功能，

	1、需要创建一个车票类，初始化票，卖票的接口saleTicket()

	2、自定义异常的一个类。

	3、创建卖票线程类，在run方法中卖车票。

	4、初始化车票的线程,负责初始化车票,也就是初始化Ticket类中的数组。

	5、创建主方法进行测试。*/

package com.javase.homework.text01;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(200);
        Thread orderT1 = new Thread(new OrderTicketThread(ticket));
        Thread orderT2 = new Thread(new OrderTicketThread(ticket));
        Thread orderT3 = new Thread(new OrderTicketThread(ticket));
        Thread orderT4 = new Thread(new OrderTicketThread(ticket));
        Thread saleTread = new Thread(new SaleTicketThread(ticket));

        orderT1.setName("线程1");
        orderT2.setName("线程2");
        orderT3.setName("线程3");
        orderT4.setName("线程4");

        orderT1.start();
        orderT2.start();
        orderT3.start();
        orderT4.start();
        saleTread.start();
    }
}
