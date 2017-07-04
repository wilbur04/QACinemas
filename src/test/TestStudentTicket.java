import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To test the StudentTicket class.
 * Created by Wilbur on 04/07/2017.
 */
public class TestStudentTicket {
    private Ticket t;

    /**
     *
     */
    @Before
    public void setUp() {
        t = new StudentTicket();
    }

    /**
     * To test if creating a student ticket adds new price.
     * Expected : 6
     * @throws Exception
     */
    @Test
    public void testPrice() throws Exception {
        assertEquals("Student ticket price correct", 6, t.getPrice());
    }
}
