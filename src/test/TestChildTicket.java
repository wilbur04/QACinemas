import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class TestChildTicket {
    private Ticket t;
    @Before
    public void setUp() {
        t = new ChildTicket();
    }

    @Test
    public void testPrice() throws Exception {
        assertEquals("Child ticket price correct", 4, t.getPrice());
    }
}
