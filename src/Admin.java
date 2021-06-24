public class Admin extends Person{
    private int income_of_day;
    private int desk_number;
    private Ticket T;

    static int number_of_buses;

    public Admin() {
        income_of_day = 0;
        desk_number = 0;
    }

    public Admin(String fn, String ln, String Mail, String Phn, int National_id, int Age, String User, String Pass,int desk_number) {
        super(fn, ln, Mail, Phn, National_id, Age, User, Pass);
        this.desk_number= desk_number;
    }

    public void setDesk_number(int desk_number) {
        this.desk_number = desk_number;
    }

    public int getDesk_number() {
        return desk_number;
    }

    public int getIncome_of_day() {
        return income_of_day;
    }

    // added new bus to our database of buses
    public void createBus(int id, String bus_route) throws Exception{
        Bus NewBus = new Bus(id, bus_route);

        //bus_database.add(NewBus);
    }

    // in case we need to change the route of bus
    public void modifyBus(Bus B, String new_bus_route){
        B.setBusRoute(new_bus_route);
    }

    public void deleteBus(Bus B, int id){
        Bus.bus_list.remove(id,B);
        System.out.println("Bus is Deleted Successfully..");
    }


    public void incomeFullDetail(){

        int incomeOfAlex = 250 * T.getAlexNumberOfTicktes();

        System.out.printf("Number Of tickts to Alex %d \t Price for Alex : %d\n",T.getAlexNumberOfTicktes(),incomeOfAlex);

        int incomeOfAswan= 300 * T.getAswanNumberOfTicktes();

        System.out.printf("Number Of tickts to Aswan %d \t Price for Aswan : %d\n",T.getAswanNumberOfTicktes(),incomeOfAswan);


        int incomeOfDahab= 265 * T.getDahabNumberOfTicktes();

        System.out.printf("Number Of tickts to Dahab %d \t Price for Dahab : %d\n",T.getDahabNumberOfTicktes(),incomeOfDahab);

        int incomeOfHurghada= 165 * T.getHurghNumberOfTicktes();

        System.out.printf("Number Of tickts to Hurghada %d \t Price for Hurghada : %d\n",T.getHurghNumberOfTicktes(),incomeOfHurghada);

        int incomeOfSharmElSheikh = 300 * T.getSharmNumberOfTicktes();

        System.out.printf("Number Of tickts to Sharm El-Sheikh %d \t Price for Sharm El-Sheikh : %d\n",T.getSharmNumberOfTicktes(),incomeOfSharmElSheikh);

        income_of_day = incomeOfAlex+incomeOfAswan+incomeOfDahab+incomeOfHurghada+incomeOfSharmElSheikh;
        System.out.println("The Whole Income of the day - Including All 5 servied places - : "+income_of_day);


    }
}
