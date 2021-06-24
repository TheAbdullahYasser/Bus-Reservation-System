public class Driver extends Person{
    private int bus_id;
    private int driver_id;
    private Bus bus = new Bus();
    public String shift;
    /*Setter for the bus*/
    /*Shift can be only AM and PM as the distance is so long and requires a lot of time so AM and PM is enough for knowing the shift*/
    public Driver(int driver_id, int bus_id, String shift,String fn , String ln, String Mail, String Phn, int National_id, int Age, String User, String Pass) throws Exception {
        super(fn ,  ln,  Mail,  Phn,  National_id, Age, User,  Pass);
        this.bus_id = bus_id;
        this.driver_id = driver_id;
        /*Assume bus id will return the instance of the bus*/
        bus = Bus.getInstance(bus_id);
        this.shift = shift;
    }
    public static int fixedSalary(int km ){
        return 50*km;
    }

    public boolean isAvailable(String shift){
       return shift.equals(this.shift);
    }
    public void setShift(String shift){
        this.shift = shift;
    }
    public void setBus(int id) throws Exception {
        bus = Bus.getInstance(id);
    }
    
    /*leave it for setters and getters or leave it Sameh ????? ????¨*/

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public Bus getBus() {
        return bus;
    }
}
