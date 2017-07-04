import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class TestStudentTicket {
    private Ticket t;
    @Before
    public void setUp() {
        t = new StudentTicket();
    }

    @Test
    public void testPrice() throws Exception {
        assertEquals("Student ticket price correct", 6, t.getPrice());
    }
}
