import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
/**
 * Created by Wilbur on 04/07/2017.
 */
public class TestTickets {
    private Ticket t;
    @Before
    public void setUp() {
        t = new Ticket();
    }

    @Test
    public void testPrice() throws Exception {
        assertEquals("ticket price correct", 8, t.getPrice());
    }
}
