import java.util.*;

public class Bus {
    private int id;
    private String bus_route;
    private static int SIZE = 30;
    private int[] seat = new int[SIZE];
    public static Set<Integer> id_list = new LinkedHashSet<Integer>();/*This to doesn't allow duplicates because it is "Set" and do the look up, insert ,delete in O(1) due to hashing*/
    public static Map<Integer,Bus> bus_list = new TreeMap<Integer, Bus>();/*To look up instances*/
    public Bus(int id) throws Exception {
        setId(id);
        bus_list.put(id,this);
    }

    public Bus(int id, String bus_route) throws Exception {
        setId(id);
        this.bus_route = bus_route;
        bus_list.put(id,this);
    }



    public Bus(){
        bus_route = " ";
    }

    public String getBus_route() {
        return bus_route;
    }

    public void setBusRoute(String bus_route) {
        this.bus_route = bus_route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        try {
            int old_size = id_list.size();
            id_list.add(id);
            if(old_size == id_list.size()){
                throw new Exception("This ID already exists");
            }else {
                this.id = id;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean seatIsAvailable(int seat_number) {
        if(seat[seat_number] == 0)
            return true;
        else
            return false;
    }

    public void setSeat(int seat_number) throws Exception {
        try {
            if (this.seat[seat_number] == 1)
                throw new Exception("This seat is already occupied");
            else
                this.seat[seat_number]++;
        }catch (Exception e){
            throw  e;
        }
    }

    public void bookSeat(int seat){
        this.seat[seat]++;
    }

    public Vector<Integer> available_seats(){
        Vector<Integer> available = new Vector<Integer>();

        for (int i = 0; i < SIZE; i++) {
            if(seat[i]==0){
                available.add(i);
            }
        }
        return available;
    }
    public int number_of_available_seats(){
        int number_available = 0;
        for (int i = 0; i < SIZE; i++) {
            if(seat[i]==0) number_available++;
        }
        return number_available;
    }

    public static Bus getInstance(int bus_id)throws Exception{
        try {
            if(id_list.contains(bus_id)){
                return bus_list.get(bus_id);
            }else {
                throw new Exception("This bus does not exist");
            }

        }catch (Exception e){
            throw e;
        }
    }
}