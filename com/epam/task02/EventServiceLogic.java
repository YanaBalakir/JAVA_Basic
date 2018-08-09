package com.epam.task02;

import com.epam.task02.Event;
import com.epam.task02.EventPlace;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public interface EventServiceLogic {

    List<Event> getEventsByDate(ArrayList<Event> minskEvents, LocalDate date);

    List<Event> getEventsByPlace(ArrayList<Event> minskEvents, EventPlace place);

    List<Event> getEventsByFreePlaces(ArrayList<Event> minskEvents);
}
