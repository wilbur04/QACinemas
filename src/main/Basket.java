import java.util.ArrayList;

/**
 * To store a list of all the tickets a customer wishes to purchase.
 *
 * Created by Wilbur on 04/07/2017.
 */
public class Basket {
    private ArrayList<Ticket> ticketsList;
    private int totalPrice;

    public Basket(){
        ticketsList = new ArrayList();
        totalPrice = 0;
    }

    /**
     *  To add a ticket ot the list of tickets.
     * @param ticket The ticket that needs to be added to the list.
     */
    public void add(Ticket ticket){
        ticketsList.add(ticket);
    }

    /**
     *  Adds various tickets to the basket after the customer selects the tickets.
     * @param standard The number of standard tickets to be added to the basket.
     * @param student The number of student tickets to be added to the basket.
     * @param OAP The number of OAP tickets to be added to the basket.
     * @param child The number of child tickets to be added to the basket.
     */
    public void add(int standard, int student, int OAP, int child){
        for (int x=0; x <= standard-1; x++){
            ticketsList.add(new Ticket());
        }
        for (int x=0; x <= student-1; x++){
            ticketsList.add(new StudentTicket());
        }
        for (int x=0; x <= OAP-1; x++){
            ticketsList.add(new OAPTicket());
        }
        for (int x=0; x <= child-1; x++){
            ticketsList.add(new ChildTicket());
        }
    }

    /**
     * The check the number of items in the basket.
     * @return The size of the basket.
     */
    public int basketSize(){
        return ticketsList.size();
    }

    /**
     * To get the lsist of all the tickets that are in the basket.
     * @return The list of all items in the basket.
     */
    public ArrayList<Ticket> getTicketsList() {
        return ticketsList;
    }

    /**
     * To get the total price of all the items in the basket.
     * @return The total price for all tickets.
     */
    public int getTotalPrice(){
        for (int x = 0; x < ticketsList.size(); x++) {
            totalPrice += ticketsList.get(x).getPrice();
        }
        return totalPrice;
    }

}
