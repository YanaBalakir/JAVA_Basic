package com.epam.mentoring.task2;

import java.util.Objects;

public class Ticket {

    private int eventId;
    private int placeNumber;
    private int cost;
    private boolean isBought;

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

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getEventId() == ticket.getEventId() &&
                getPlaceNumber() == ticket.getPlaceNumber() &&
                getCost() == ticket.getCost() &&
                isBought() == ticket.isBought();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEventId(), getPlaceNumber(), getCost(), isBought());
    }
}
