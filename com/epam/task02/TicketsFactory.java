package com.epam.task02;

import com.epam.task02.Ticket;

import java.util.ArrayList;

public class TicketsFactory {
    public static ArrayList<Ticket> createTickets(int id, int ticketsLimit) {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        for (Ticket ticket : tickets) {
           int i=0;
            tickets.add(new Ticket(1, i+1,30, true));
        }
        return tickets;
    }
}
