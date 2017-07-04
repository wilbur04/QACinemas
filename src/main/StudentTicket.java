/**
 * Inherits the class Ticket to create a student ticket.
 * Created by Wilbur on 04/07/2017.
 */
public class StudentTicket extends Ticket {

    @Override
    public void setPrice() {
        this.setPrice(6);
    }
}
