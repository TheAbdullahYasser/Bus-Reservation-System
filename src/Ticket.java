public class Ticket {
    static int Alex_number_of_tickets = 0;
    static int Sharm_number_of_tickets = 0;
    static int Dahab_number_of_tickets = 0;
    static int Hurgh_number_of_tickets = 0;
    static int Aswan_number_of_tickets = 0;
    static int number_of_tickets = 0;

    public int ticket_id;
    private Bus B = new Bus(); // will be change when we connect the database;
    private int seat_number;
    private String destination;
    private String date_of_leaving;
    private String date_of_arriving;
    private String time_of_leaving;
    private int price;


    public Ticket(Bus B2){
        B = B2;
        seat_number = 0;
        destination = " ";
        date_of_leaving = " ";
        date_of_arriving = " ";
        time_of_leaving = " ";
        price = 0;
        number_of_tickets++;
        ticket_id  = number_of_tickets;
    }

    public Ticket(Bus B2, String dest, String doL, String doA)
    {
        B = B2;
        destination = dest;
        date_of_leaving = doL;
        date_of_arriving = doA;
        ticket_id  = number_of_tickets++;
    }

    Ticket()
    {
        seat_number = 0;
        destination = " ";
        date_of_leaving = " ";
        date_of_arriving = " ";
        time_of_leaving = " ";
        price = 0;
        number_of_tickets++;
        ticket_id  = number_of_tickets;

    }

    public void setDestination(String destination) {
        this.destination = destination;
        B.setBusRoute(destination);
    }

    public void setDateOfLeaving(String dateOfLeaving) {
        this.date_of_leaving = dateOfLeaving;
    }
    public void setDateOfArriving(String dateOfArriving) {
        this.date_of_arriving = dateOfArriving;
    }
    public void setTimeOfLeaving(String timeOfLeaving) {
        this.time_of_leaving = timeOfLeaving;
    }
    public int ticketID(){
        return ticket_id;
    }

    public int ticketBusId(){
        return B.getId();
    }

    public int getAlexNumberOfTicktes(){
        return Alex_number_of_tickets;
    }

    public int getSharmNumberOfTicktes(){
        return Sharm_number_of_tickets;
    }

    public int getDahabNumberOfTicktes(){
        return Dahab_number_of_tickets;
    }

    public int getHurghNumberOfTicktes(){
        return Hurgh_number_of_tickets;
    }

    public int getAswanNumberOfTicktes(){
        return Aswan_number_of_tickets;
    }

    public void ticketSeatNumber(int seat_num)throws Exception{
        try{
            if(B.seatIsAvailable(seat_num)){
                B.bookSeat(seat_num);
            }
            else{
                throw new Exception("This seat is already taken.");
            }
        }
        catch(Exception e){
            throw e;
        }
    }

    public String getTicketDestination(){
        return destination;
    }

    public String getTicketDateOfLeaving(){
        return date_of_leaving;
    }

    public String getTicketDateOfArriving(){
        return date_of_arriving;
    }

    public String getTimeOfLeaving(){
        return time_of_leaving;
    }

    public int getSeatNumber(){
        return seat_number;
    }

    public void getBusInfo(){
        System.out.printf("Bus id:%d\nBus route:%s\nSeat number:%d\n", B.getId(), B.getBus_route(), getSeatNumber());
    }

    //A function used to return the price of the destination choosen by the user
    public int getPrice(String d)
    {
        switch(d){
            case "Alexandria":
                price = 250;
                Alex_number_of_tickets++;
                break;
            case "Sharm El-Sheikh":
                price = 250;
                Sharm_number_of_tickets++;
                break;
            case "Dahab":
                price = 265;
                Dahab_number_of_tickets++;
                break;
            case "Hurghada":
                price = 265;
                Hurgh_number_of_tickets++;
                break;
            case "Aswan":
                price = 300;
                Aswan_number_of_tickets++;
                break;
            default:
                price = 0;
        }
        return price;
    }
}