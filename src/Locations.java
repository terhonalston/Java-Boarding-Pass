import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Locations {

    public Locations(){}
        HashMap<String, Integer> places = new HashMap<>();
        {
            places.put("NYC", 10);
            places.put("Atlanta", 20);
            places.put("California", 30);
        }

    public String getEta(Ticket ticket){

        String origin = ticket.getOrigin();
        String destination = ticket.getDestination();
        double eta = Double.parseDouble(places.get(destination).toString())
                + Double.parseDouble(places.get(origin).toString());
        ticket.setETA(String.valueOf(eta));
        return String.valueOf(eta);
    }

    public String toString(){

        return places.toString();
    }
}





