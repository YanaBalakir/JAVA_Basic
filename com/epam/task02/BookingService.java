package com.epam.task02;

import java.util.ArrayList;
import java.util.List;


public class BookingService implements BookingServiceLogic {


    public int getTicketsCostOnEvent(final Event event, final int ticketAmount) {
        final List<Ticket> freeTickets = new ArrayList<>();
        for (Ticket ticket : event.getTickets()) {
            if (!ticket.isAvailable()) {
                freeTickets.add(ticket);
            }
        }
        final int freeTicketsAmount = freeTickets.size();
        int finalCost = 0;

        if (freeTicketsAmount >= ticketAmount) {
            for (Ticket ticket : freeTickets) {
                finalCost += ticket.getCost();
            }
        }
        return finalCost;
    }

    public List <Ticket> bookTicketsOnEvent(final Event event, final int ticketAmount) {

        final List<Ticket> freeTickets = new ArrayList<>();
        for (Ticket ticket : event.getTickets()) {
            if (!ticket.isAvailable()) {
                freeTickets.add(ticket);
            }
        }
        final int freeTicketsAmount = freeTickets.size();
        int finalCost = 0;

        if (freeTicketsAmount >= ticketAmount) {
            freeTickets.stream().limit(ticketAmount).forEach(ticket -> ticket.setAvailable(true));
        }
        return freeTickets;
    }
}
