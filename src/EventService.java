import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EventService {
    private List<Event> allEvents = new ArrayList<>();

    public EventService(List<Event> allEvents) {
        this.allEvents = allEvents;
    }


    public List<Event> getEventsByDate(final Date date) {
        return allEvents.stream()
                .filter(event -> event.getEventDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<Event> getEventsByPlace(final String eventPlace) {
        return allEvents.stream()
                .filter(event -> event.getEventPlace().equals(eventPlace))
                .collect(Collectors.toList());
    }

    public List<Event> getEventsByFreePlaces(final String eventPlace) {
        final List<Event> eventsWithFreePlaces = new ArrayList<>();

        for(final Event event:allEvents) {
            final List<Ticket> ticketList = event.getTickets();
            final List<Ticket> notBoughtTickets;
            notBoughtTickets = ticketList.stream().filter(ticket -> !ticket.isBought()).collect(Collectors.toList());
            if(notBoughtTickets.size()>0) {
                eventsWithFreePlaces.add(event);
            }
        }
        return eventsWithFreePlaces;
    }



    public List<Event> getAllEvents() {
        return allEvents;
    }

    public void setAllEvents(List<Event> allEvents) {
        this.allEvents = allEvents;
    }
}