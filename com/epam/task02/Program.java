package com.epam.task02;

import com.epam.task02.*;

import java.time.LocalDate;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        try {
            ArrayList<Event> minskEvents = EventFactory.createEvents();

            // Events Sorting
            EventService sorting = new EventService();
            sorting.getEventsByPlace(minskEvents, EventPlace.PALACE);
            sorting.getEventsByFreePlaces(minskEvents);
            sorting.getEventsByDate(minskEvents, LocalDate.of(2018, 8, 8));

            //Tickets booking
            BookingService booking = new BookingService();
            booking.getTicketsCostOnEvent(minskEvents.get(2), 12);
            booking.bookTicketsOnEvent(minskEvents.get(1), 3);

            System.out.println("Minsk Events: " + minskEvents.size());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Error!");
        }
    }
}

