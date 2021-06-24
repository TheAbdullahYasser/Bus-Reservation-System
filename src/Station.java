import java.util.*;
public class Station {
    private int station_id;
    private String name;
    private String Location;
    private int size;/*High medium low*/
    private int capacity;/*Number of buses that the station could hold*/
    private int cost_per_hour;
    private int current_capacity; /* Current buses in the station*/
    private boolean has_gas_station;
    private final float gas_price_per_letter =  7.25f;
    /*Hypothesis: in later stages in the project, the Bus fuel will run out and the station will refuel it again
    and Bus will cost but this attributes will be added in the next phase*/
    private static ArrayList<Integer> id_list = new ArrayList<Integer>();
    private static ArrayList<Bus> bus_list = new ArrayList<Bus>();
    public int pricePerHours(int hours){
        return hours*cost_per_hour;
    }
    public float fuelCost(float letter){
        return letter*gas_price_per_letter;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost_per_hour() {
        return cost_per_hour;
    }

    public void setCost_per_hour(int cost_per_hour) {
        this.cost_per_hour = cost_per_hour;
    }

    public int getCurrent_capacity() {
        return current_capacity;
    }

    public void setCurrent_capacity(int current_capacity) {
        this.current_capacity = current_capacity;
    }

    public boolean isHas_gas_station() {
        return has_gas_station;
    }

    public void setHas_gas_station(boolean has_gas_station) {
        this.has_gas_station = has_gas_station;
    }
    
    public static ArrayList<Bus> getBus_list() {
        return bus_list;
    }

    public static void setBus_list(ArrayList<Bus> bus_list) {
        Station.bus_list = bus_list;
    }
    
    public void setId_List(int id) throws Exception {
        try {
            for (Integer id_list1 : id_list) {
                int old_size = id_list.size();
                if(old_size == id_list.size()){
                    throw new Exception("This ID already exists");
                }else {
                    this.station_id = id;
                }
            }
            id_list.add(id);
        } catch (Exception e) {
            throw e;
        }
    }


}

