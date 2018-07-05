import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

// TODO: DK: То что это сервис, может подразумевать что в будущем может измениться что-то в реализации. Было бы удобнее ввести интерфейс для EventService
public class EventService {
    private List<Event> allEvents = new ArrayList<>();

    public EventService(List<Event> allEvents) {
        this.allEvents = allEvents;
    }


    public List<Event> getEventsByDate(final Date date) {
        // TODO: DK: Очень хорошо что использовала stream API.
        return allEvents.stream()
                .filter(event -> event.getEventDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<Event> getEventsByPlace(final String eventPlace) {
        return allEvents.stream()
                .filter(event -> event.getEventPlace().equals(eventPlace))
                .collect(Collectors.toList());
    }

    // TODO: DK: Если аргумент метода не используется (в твоём случае 'eventPlace') то нет смысл его передавать в метод.
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

    // TODO: DK: Если мы передаём ивенты в конструкторе, скорее всего мы не будем их сетать из вне. В этом случае можно не открывать метод setAllEvents()
    public void setAllEvents(List<Event> allEvents) {
        this.allEvents = allEvents;
    }
}