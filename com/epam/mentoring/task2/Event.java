package com.epam.mentoring.task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Event {

    private int id;
    private String eventName;
    private String eventDescription;
    private Date eventDate;
    private EventPlace place;
    private List<Ticket> tickets = new ArrayList<Ticket>();

    public Event(int id, String eventName, String eventDescription, Date eventDate, EventPlace place, List<Ticket> tickets) {
        this.id = id;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.place = place;
        this.tickets = tickets;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public EventPlace getPlace() {
        return place;
    }

    public void setEventPlace(EventPlace place) {
        this.place = place;
    }


    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getId() == event.getId() &&
                Objects.equals(getEventName(), event.getEventName()) &&
                Objects.equals(getEventDescription(), event.getEventDescription()) &&
                Objects.equals(getEventDate(), event.getEventDate()) &&
                Objects.equals(getTickets(), event.getTickets());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getEventName(), getEventDescription(), getEventDate(), getTickets());
    }

}

enum EventPlace {
    PALACE, MINSKARENA, DINAMO
}
