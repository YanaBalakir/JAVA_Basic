package com.epam.task02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class EventService implements EventServiceLogic {

    public List<Event> getEventsByDate(ArrayList<Event> minskEvents, LocalDate date) {
        final List<Event> eventsByDate = new ArrayList<>();
        for (Event event : minskEvents) {
            if (event.getEventDate().isEqual(date)) {
                eventsByDate.add(event);
            }
        }
        return eventsByDate;
    }

    public List<Event> getEventsByPlace(ArrayList<Event> minskEvents, EventPlace place) {
        final List<Event> eventsByPlace = new ArrayList<>();
        for (Event event : minskEvents) {
            if (event.getPlace().contains(place.name())) {
                eventsByPlace.add(event);
            }
        }
        return eventsByPlace;
    }

    public List<Event> getEventsByFreePlaces(ArrayList<Event> minskEvents) {

        final List<Event> eventsWithFreePlaces = new ArrayList<>();

        for (Event event : minskEvents) {
            final List<Ticket> ticketList = event.getTickets();
            for (Ticket ticket: ticketList){
                if (ticket.isAvailable()){

                }
           /*final List<Ticket> notBoughtTickets;
            notBoughtTickets = ticketList.stream().filter(ticket -> !ticket.isAvailable()).collect(Collectors.toList());
            if (notBoughtTickets.size() > 0) {*/
                eventsWithFreePlaces.add(event);
            }
        }
        return eventsWithFreePlaces;
    }

}
