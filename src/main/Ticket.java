import java.util.Calendar;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class Ticket {
    private int price;
    Calendar c = Calendar.getInstance();

    public Ticket(){
        this.price = 8;
    }

    public int getPrice() {
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
            return this.price - 2;
        } else {
            return price;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
