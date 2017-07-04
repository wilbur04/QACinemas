import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * To test the Basket class.
 * Created by Wilbur on 04/07/2017.
 */
public class TestBasket {
    private Basket b;

    @Before
    public void setUp(){
     b = new Basket();
     b.add(1,0,2,1);
    }

    /**
     * To tes if all tickets have been added to the basket by checking the size of the list.
     * Expected: 4
     * @throws Exception
     */
    @Test
    public void testBasketSize() throws Exception {
        assertEquals("Tickets in basket: " , 4, b.basketSize());
    }

    /**
     * To test if additional tickets can be added to the basket by checking size.
     * Expected: 5
     * @throws Exception
     */
    @Test
    public void testAddToBasket() throws Exception{
        b.add(new ChildTicket());
        assertEquals("Ticket added to basket: " , 5, b.basketSize());

    }

    /**
     * To test the the price of all the items in the basket.
     * Also checks for day of the week to see if any discounts apply.
     * Expected: 16 on Wednesday and 24 on other days.
     * @throws Exception
     */
    @Test
    public void testBasketPrice() throws Exception{
        int price;
        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
            price = 16;
        } else {
            price = 24;
        }
        assertEquals("Ticket price " , price, b.getTotalPrice());
    }
}
