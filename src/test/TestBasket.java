import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class TestBasket {
    private Basket b;

    @Before
    public void setUp(){
     b = new Basket();
     b.add(1,0,2,1);
    }

    @Test
    public void testBasketSize() throws Exception {
        assertEquals("Tickets in basket: " , 4, b.basketSize());
    }

    @Test
    public void testAddToBasket(){
        b.add(new ChildTicket());
        assertEquals("Ticket added to basket: " , 5, b.basketSize());

    }

    @Test
    public void testBasketPrice(){
        int price;
        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
            price = 16;
        } else {
            price = 24;
        }
        assertEquals("Ticket price " , price, b.getTotalPrice());

    }
}
