package com.javase.homework.text01;

import java.util.List;

public class SaleTicketThread implements Runnable {
    Ticket ticket;

    public SaleTicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket.getTickets().size() > 0) {
            if (ticket.getSaleTicket() == null) {
                System.out.println("开始售票");
                ticket.setSaleTicket(ticket.saleTicket());
            }
        }
        try {
            throw new TicketNumberException("票已全部出售。");
        } catch (TicketNumberException e) {
            e.printStackTrace();
        }
    }
}
