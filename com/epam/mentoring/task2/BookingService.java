package com.epam.mentoring.task2;

import java.util.ArrayList;
import java.util.List;


public class BookingService {
    private Event event;
    private int ticketAmount;

    public BookingService(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public int getTicketsCostOnEvent(final Event event, final int ticketAmount) {
        final List<Ticket> freeTickets = new ArrayList<>();
        for(Ticket ticket : event.getTickets()){
            if(!ticket.isBought()) {
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

    public void bookTicketsOnEvent(final Event event, final int ticketAmount) {

        final List<Ticket> freeTickets  = new ArrayList<>();
        for(Ticket ticket : event.getTickets()) {
            if (!ticket.isBought()) {
                freeTickets.add(ticket);
            }
        }
        final int freeTicketsAmount = freeTickets.size();
        int finalCost = 0;

        if (freeTicketsAmount >= ticketAmount) {
            freeTickets.stream().limit(ticketAmount).forEach(ticket -> ticket.setBought(true));
        }
    }
}
