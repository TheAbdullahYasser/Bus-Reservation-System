import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static String Destination(int c){
        switch(c)
        {
            case 1:
                return "Alexandria";
            case 2:
                return "Sharm El-Sheikh";
            case 3:
                return "Dahab";
            case 4:
                return "Hurghada";
            default:
                return "Aswan";
        }
    }


    public static void AddressMenuDisplay(){
        System.out.println("Enter the location");
        System.out.println("1. Alexandria");
        System.out.println("2. Sharm El-Sheikh");
        System.out.println("3. Dahab");
        System.out.println("4. Hurghada");
        System.out.println("5. Aswan");
    }

    public static void Login()
    {
        Passenger passenger = new Passenger();
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter User name: ");
        String user_name = scan.nextLine();
        passenger.setUsername(user_name);

        System.out.println("Enter Password: ");
        String password = scan.nextLine();
        passenger.setPassword(password);

        if("abdo".equals(user_name) && "12345".equals(password)){
            System.out.println("Login Successfully...");
            AddressMenuDisplay();
        }else {
            System.out.println("Login Failed...");
            return;
        }

        int menu_choice = scan.nextInt();
        scan.skip("\n");
        String destination = Destination(menu_choice);

        passenger.ticket.setDestination(destination);

        System.out.println("Enter the date of arriving: ");
        String date_of_arriving = scan.nextLine();
        passenger.ticket.setDateOfArriving(date_of_arriving);
        System.out.println("Enter date of leaving: ");
        String date_of_leaving = scan.nextLine();
        passenger.ticket.setDateOfLeaving(date_of_leaving);
        passenger.bookingDetails();

        }




    public static void Register() throws IOException
    {
        Scanner scan = new Scanner (System.in);
        Ticket ticket = new Ticket();
        List <Passenger> dataOfUsers = new ArrayList();
        List <Ticket> TicketInfo = new ArrayList();

        System.out.println("Enter your credit card: ");
        long cc = scan.nextLong();
        scan.skip("\n");

        System.out.println("Enter the First name: ");
        String fname = scan.nextLine();

        System.out.println("Enter the Last name: ");
        String lname = scan.nextLine();

        System.out.println("Enter your mail: ");
        String mail = scan.nextLine();

        System.out.println("Enter your Phone number: ");
        String phone = scan.nextLine();

        System.out.println("Enter your User name: ");
        String username = scan.nextLine();

        System.out.println("Enter your Password: ");
        String password = scan.nextLine();

        System.out.println("Enter your national id: ");
        long ssn = scan.nextLong();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();



        AddressMenuDisplay();

        int menu_choice = scan.nextInt();

        String destination = Destination(menu_choice);
        ticket.setDestination(destination);


        Passenger passenger = new Passenger(cc, fname, lname, mail, phone, ssn, age, username, password, destination);

        dataOfUsers.add(passenger);
        TicketInfo.add(ticket);
        System.out.println(dataOfUsers);
        System.out.println(TicketInfo);


    }

    public static void main(String[] args) throws Exception
    {

        Scanner scan = new Scanner (System.in);
        System.out.println("1. Login ");
        System.out.println("2. Resgister ");
        int c = scan.nextInt();
        if(c == 1){
            //note: login can be vertified by creating an array of passengers, but for simplisity reasons it will be left out until we build a DB. 
            Login();
        }
        else
        {
            Register();
        }
        //this object will be created normally;
        Bus b = new Bus(20,"Helwan");
        Bus b2 = new Bus(201);
        //this object will throw exception because the id is exist;
        Bus b3 = new Bus(201);
        /*To avoid this ERROR change one of the IDs of 201 make it 202 and it will work just fine*/
    }

}