public class Passenger extends Person
{
    static int numOfPassengers;
    private long creditCard;
    private String[] history;
    private String destination;
    public Ticket ticket = new Ticket();

    Passenger()
    {
        creditCard = 0;
        history = new String [100];
        numOfPassengers++;
        destination = " ";
    }

    Passenger(long cc, String fn , String ln, String m, String phone, long ssn, int a, String user, String pass, String Destination)
    {
        creditCard = cc;
        fname = fn;
        lname = ln;
        mail = m;
        phone_number = phone;
        national_id = ssn;
        age = a;
        userName = user;
        password = pass;
        destination = Destination;
    }
    public void setCreditCard(long cc){
        creditCard = cc;
    }

    public String getDate(){
        return ticket.getTicketDateOfArriving();
    }

    public int getNumberOfPassengers(){
        return numOfPassengers;
    }

    @Override
    public String toString() {
        return    "Passenger details:\n"
                + "creditCard: " + creditCard + "\n"
                + "First name: " + fname + "\n"
                + "Last name: " + lname + "\n"
                + "Mail: " + mail + "\n"
                + "Phone number: " + phone_number + "\n"
                + "National id: " + national_id + "\n"
                + "Age: " + age + "\n"
                + "User Name: " + userName + "\n"
                + "Password: " + password + "\n"
                + "Destination: " + destination + "\n";
    }

    public void bookingDetails(){


        System.out.println("Your Ticket has been booked to " + ticket.getTicketDestination());
        ticket.getBusInfo();
        System.out.printf("Ticket id:%d\nDate of arriving:%s\nDate of Leaving:%s\nPrice:%d\n",ticket.ticketID(), ticket.getTicketDateOfArriving(),
                ticket.getTicketDateOfLeaving(), ticket.getPrice(ticket.getTicketDestination()));


    }
}