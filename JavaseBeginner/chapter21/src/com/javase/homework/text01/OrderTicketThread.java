package com.javase.homework.text01;

public class OrderTicketThread implements Runnable {
    Ticket ticket;

    public OrderTicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        String getTicket;
        while (ticket.getTickets().size() > 0) {
            synchronized (ticket) {
                if ((getTicket = ticket.getSaleTicket()) != null) {
                    System.out.println(Thread.currentThread().getName() + "已抢到" + getTicket);
                    ticket.setSaleTicket(null);
                }
            }
        }
        try {
            throw new TicketNumberException("没票了。");
        } catch (TicketNumberException e) {
            e.printStackTrace();
        }
    }
}
