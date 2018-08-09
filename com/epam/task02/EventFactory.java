package com.epam.task02;

import java.util.ArrayList;

public class EventFactory {

    public static ArrayList<Event> createEvents() {
        ArrayList<Event> minskEvents = new ArrayList<Event>();
        EventsPropertiesReader.getEventsProperties();
        int i = 1;
        while (EventsPropertiesReader.getEventName(i) != null) {
            minskEvents.add(new Event(
                    EventsPropertiesReader.getId(i),
                    EventsPropertiesReader.getEventName(i),
                    EventsPropertiesReader.getEventDescription(i),
                    EventsPropertiesReader.getEventDate(i),
                    EventsPropertiesReader.getPlace(i),
                    TicketsFactory.createTickets(EventsPropertiesReader.getId(i), EventsPropertiesReader.getTicketsLimit(i))

            ));

            i++;
        }

        return minskEvents;
    }
}
