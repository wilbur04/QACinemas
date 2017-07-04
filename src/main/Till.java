import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Wilbur on 04/07/2017.
 */
public class Till {
    private int date,month,year,dayOfWeek;
    private Calendar c = Calendar.getInstance();
    private Scanner sc;
    private Basket basket;
    private int standardTickets, childTickets, OAPTickets, studentTickets;

    public Till(){
        sc = new Scanner(System.in);
        basket = new Basket();
    }

    public void selectDate(){
        System.out.println("Would you like to select a show for today? (y/n)");
        String resp = sc.next();
        if (resp.equals("y")){
            date = c.get(Calendar.DAY_OF_MONTH);
            month = c.get(Calendar.MONTH)+1;
            year = c.get(Calendar.YEAR);
        } else if (resp.equals("n")){
            //todo:c checks to check for valid dates.
            // checks may be invalid if we implement a calender to pick the date in the GUI.
            System.out.println("Please enter Date");
            date = sc.nextInt();
            System.out.println("Please enter Month");
            month = sc.nextInt()-1;
            System.out.println("Please enter Year");
            year = sc.nextInt();
            c.set(year,month,date);
        } else {
            System.out.println( "Invalid response. \nPlease try again");
            selectDate();
        }
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    }

    public void addTickets(){
        System.out.println("Please enter number of Standard tickets");
        standardTickets = sc.nextInt();
        System.out.println("Please enter number of Student tickets");
        studentTickets = sc.nextInt();
        System.out.println("Please enter number of OAP tickets");
        OAPTickets = sc.nextInt();
        System.out.println("Please enter number of Child tickets");
        childTickets = sc.nextInt();
        basket.add(standardTickets,studentTickets,OAPTickets,childTickets);
    }

    public int getTotalPrice(){
        return basket.getTotalPrice();
    }

}
