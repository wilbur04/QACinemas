import java.util.Scanner;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int standardTickets, childTickets, OAPTickets, studentTickets;
        Basket basket = new Basket();

        System.out.println("Please enter number of Standard tickets");
        standardTickets = sc.nextInt();
        System.out.println("Please enter number of Student tickets");
        studentTickets = sc.nextInt();
        System.out.println("Please enter number of OAP tickets");
        OAPTickets = sc.nextInt();
        System.out.println("Please enter number of Child tickets");
        childTickets = sc.nextInt();

        basket.add(standardTickets,studentTickets,OAPTickets,childTickets);

        System.out.println("The total cost of tickets for this movie is £"+ basket.getTotalPrice() +".");

    }
}
