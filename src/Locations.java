import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Locations {

    public Locations(){}
        HashMap<String, Integer> places = new HashMap<String, Integer>();
        {
            places.put("NYC", 10);
            places.put("Atlanta", 20);
            places.put("California", 30);
        }

    public String getEta(Ticket ticket){

        String origin = ticket.getOrigin();
        String destination = ticket.getDestination();
        double eta = 0;

        eta = Double.parseDouble(places.get(destination).toString())
                + Double.parseDouble(places.get(origin).toString());
        return String.valueOf(eta);
    }

    public String toString(){

        return places.toString();
    }
}





