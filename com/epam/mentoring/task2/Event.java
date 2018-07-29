package com.epam.mentoring.task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Event {

    private int id;
    private String eventName;
    private String eventDescription;
    private String eventPlace;

    /*enum EventPlace {
        PLACE1, PLACE2, PLACE3
    }*/

    private Date eventDate;
    private List<Ticket> tickets = new ArrayList<Ticket>();

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

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
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