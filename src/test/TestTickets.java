import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
/**
 * To Test StandardTickets class.
 * Created by Wilbur on 04/07/2017.
 */
public class TestTickets {
    private Ticket t;
    @Before
    public void setUp() {
        t = new StandardTicket();
    }

    @Test
    public void testPrice() throws Exception {
        assertEquals("Ticket price correct", 8, t.getPrice());
    }
}
