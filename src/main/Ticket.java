import java.util.Calendar;

/**
 * This class is used to create the tickets for the cinema.
 * Created by Wilbur on 04/07/2017.
 */
public class Ticket {
    private int price;
    Calendar c = Calendar.getInstance();

    public Ticket(){
        this.price = 8;
    }

    /**
     * Gets the price of the ticket depending on its type.
     * It also takes into account any discounts that need to be added to the price.
     * @return The price of the ticket.
     */
    public int getPrice() {
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
            return this.price - 2;
        } else {
            return price;
        }
    }

    /**
     * To set or change the price of the ticket.
     * @param price The price for the ticket.
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
