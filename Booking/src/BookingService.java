import java.util.List;
import java.util.stream.Collectors;

// TODO: DK: То что это сервис, может подразумевать что в будущем может измениться что-то в реализации. Было бы удобнее ввести интерфейс для BookingService
// TODO: DK: стоило бы написать какой-то клиент , например класс с методом нейм который использует сервис.
public class BookingService {
    // TODO: DK: Не совсем понятно для чего хранить event и ticketAmount как поля класса, можешь рассказать?
    private Event event;
    private int ticketAmount;

    public BookingService(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public int getTicketsCostOnEvent(final Event event, final int ticketAmount) {
        final List<Ticket> freeTickets = event.getTickets()
                .stream()
                .filter(ticket -> !ticket.isBought())
                .collect(Collectors.toList());
        final int freeTicketsAmount = freeTickets.size();
        int finalCost = 0;

        if (freeTicketsAmount >= ticketAmount) {
            for (Ticket ticket : freeTickets) {
                // TODO: DK: Ты считаешь стоимость всех свободных билетов, хотелось бы получить стоимость требуемого количества билетов.
                finalCost += ticket.getCost();
            }
        }
        // TODO: DK: В случае если нет нужного количества билетов можно бросать свой кастомный эксепшн а выше его обрабатывать. Это позволит отличить случаи когда нет свободных билетов и когда стоимость 0.
        return finalCost;
    }

    // TODO: DK: Из метода можно было бы возвращать забронированные билеты
    public void bookTicketsOnEvent(final Event event, final int ticketAmount) {
        final List<Ticket> freeTickets = event.getTickets()
                .stream()
                .filter(ticket -> !ticket.isBought())
                .collect(Collectors.toList());
        final int freeTicketsAmount = freeTickets.size();
        int finalCost = 0;

        if (freeTicketsAmount >= ticketAmount) {
            freeTickets.stream().limit(ticketAmount).forEach(ticket -> ticket.setBought(true));
        }
    }
}
