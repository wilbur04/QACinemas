import java.util.Scanner;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class Main {

    public static void main (String [] args){
        Till t = new Till();

        t.selectDate();
        t.addTickets();
        System.out.println("The total cost of tickets for this movie is £"+ t.getTotalPrice() +".");

    }
}
