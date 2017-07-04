import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To test the OAPTicket class.
 * Created by Wilbur on 04/07/2017.
 */
public class TestOAPTicket {
    private Ticket t;
    @Before
    public void setUp() {
        t = new OAPTicket();
    }

    /**
     * To test if creating an OAP ticket adds new price.
     * Expected : 6
     * @throws Exception
     */
    @Test
    public void testPrice() throws Exception {
        assertEquals("OAP ticket price correct", 6, t.getPrice());
    }
}
