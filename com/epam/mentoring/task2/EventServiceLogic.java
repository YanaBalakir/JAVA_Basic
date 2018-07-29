package com.epam.mentoring.task2;

import com.epam.mentoring.task2.Event;

import java.util.List;
import java.util.Date;

public interface EventServiceLogic {
     List <Event> getEventsByDate(Date date);
     List <Event> getEventsByPlace (String eventPlace);
     List <Event> getEventsByFreePlaces (String eventPlace);

}
