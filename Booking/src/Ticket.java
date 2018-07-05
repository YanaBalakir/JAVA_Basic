public class Ticket {
    // TODO: DK: Лучше давать имена пакетам , а не делать в дефолтном пакете , например "com.epam.mentoring.booking"

    private int eventId;
    private int placeNumber;

    //TODO: DK: Цену тоже можно было добавить в конструктор (одинаковая цена имелось ввиду в рамкам одного ивента, для разных ивентов может быть разная).
    private int cost = 100;
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

    // TODO: DK: В таких классах обычно переопределют equals() и hashcode()
    }