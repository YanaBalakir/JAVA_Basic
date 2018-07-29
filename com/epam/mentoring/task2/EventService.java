package com.epam.mentoring.task2;

import com.epam.mentoring.task2.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EventService implements EventServiceLogic {
    private List<Event> allEvents = new ArrayList<>();

    public EventService(List<Event> allEvents) {
        this.allEvents = allEvents;
    }


    public List<Event> getEventsByDate(final Date date) {
        final List<Event> events = new ArrayList<>();
        for (Event event : allEvents) {
            if (event.getEventDate().equals(date)) {
                events.add(event);
            }
        }
        return events;
    }

    public List<Event> getEventsByPlace(final String eventPlace) {
        final List<Event> events = new ArrayList<>();
        for(Event event: allEvents) {
            if(event.getEventPlace().equals(eventPlace)){
                events.add(event);
            }
        }
        return events;
    }

    public List<Event> getEventsByFreePlaces(final String eventPlace) {
        final List<Event> eventsWithFreePlaces = new ArrayList<>();

        for (final Event event : allEvents) {
            final List<Ticket> ticketList = event.getTickets();
            final List<Ticket> notBoughtTickets;
            notBoughtTickets = ticketList.stream().filter(ticket -> !ticket.isBought()).collect(Collectors.toList());
            if (notBoughtTickets.size() > 0) {
                eventsWithFreePlaces.add(event);
            }
        }
        return eventsWithFreePlaces;
    }


    public List<Event> getAllEvents() {
        return allEvents;
    }

}
