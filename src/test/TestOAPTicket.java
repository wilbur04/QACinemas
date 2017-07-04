import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class TestOAPTicket {
    private Ticket t;
    @Before
    public void setUp() {
        t = new OAPTicket();
    }

    @Test
    public void testPrice() throws Exception {
        assertEquals("OAP ticket price correct", 8, t.getPrice());
    }
}
