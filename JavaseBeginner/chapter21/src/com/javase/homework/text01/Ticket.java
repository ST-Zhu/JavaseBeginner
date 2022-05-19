package com.javase.homework.text01;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<String> tickets;
    private String saleTicket;

    public Ticket() {
    }

    public Ticket(int number) {
        tickets = new ArrayList<>(number * 2);
        for (int i = 0; i < number; i++) {
            tickets.add("第" + (number - i) + "张车票");
        }
    }

    public List<String> getTickets() {
        return tickets;
    }

    public void setTickets(List<String> tickets) {
        this.tickets = tickets;
    }

    public String getSaleTicket() {
        return saleTicket;
    }

    public void setSaleTicket(String saleTicket) {
        this.saleTicket = saleTicket;
    }

    public String saleTicket() {
        String s = tickets.get(tickets.size() - 1);
        tickets.remove(tickets.size() - 1);
        return s;
    }
}
