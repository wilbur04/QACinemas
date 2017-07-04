import java.util.ArrayList;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class Basket {
    private ArrayList<Ticket> ticketsList;
    private int totalPrice;

    public Basket(){
        ticketsList = new ArrayList();
        totalPrice = 0;
    }

    public void add(Ticket ticket){
        ticketsList.add(ticket);
    }

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

    public int basketSize(){
        return ticketsList.size();
    }


    public ArrayList<Ticket> getTicketsList() {
        return ticketsList;
    }

    public int getTotalPrice(){
        for (int x = 0; x < ticketsList.size(); x++) {
            totalPrice += ticketsList.get(x).getPrice();
        }
        return totalPrice;
    }

}
