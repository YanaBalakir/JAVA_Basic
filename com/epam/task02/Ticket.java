package com.epam.task02;

import java.util.Objects;

public class Ticket {

    private int eventId;
    private int placeNumber;
    private int cost;
    private boolean isAvailable;

    public Ticket(int eventId, int placeNumber, int cost, boolean isAvailable) {
        this.eventId = eventId;
        this.placeNumber = placeNumber;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getEventId() == ticket.getEventId() &&
                getPlaceNumber() == ticket.getPlaceNumber() &&
                getCost() == ticket.getCost() &&
                isAvailable() == ticket.isAvailable();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEventId(), getPlaceNumber(), getCost(), isAvailable());
    }
}
