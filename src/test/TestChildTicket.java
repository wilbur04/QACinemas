import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *To test the ChildTicket class.
 * Created by Wilbur on 04/07/2017.
 */
public class TestChildTicket {
    private Ticket t;
    @Before
    public void setUp() {
        t = new ChildTicket();
    }

    /**
     * To test if creating a child ticket adds new price.
     * Expected : 4
     * @throws Exception
     */
    @Test
    public void testPrice() throws Exception {
        assertEquals("Child ticket price correct", 4, t.getPrice());
    }
}
