package com.epam.task02;

import java.util.List;

public interface BookingServiceLogic {

    int getTicketsCostOnEvent(Event event, int ticketAmount);
    List<Ticket> bookTicketsOnEvent(Event event, int ticketAmount);
}
