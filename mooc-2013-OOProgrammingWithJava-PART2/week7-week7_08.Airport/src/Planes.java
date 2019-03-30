
import java.util.ArrayList;
import java.util.HashMap;

public class Planes {

    ArrayList<String> flights;
    HashMap<String, Integer> plane;

    public Planes() {
        this.flights = new ArrayList<String>();
        this.plane = new HashMap<String, Integer>();
    }

    public void addPlanes(String id, int capacity) {

        this.plane.put(id, capacity);

    }

    public void printPlanes() {

        for (String key : this.plane.keySet()) {

            System.out.println(key + " (" + this.plane.get(key) + " ppl)");

        }

    }

    public String printPlaneInfo(String id) {
        return (id + " (" + this.plane.get(id) + " ppl)");
    }

    public void printFlights() {
        for (String flight : this.flights) {

            System.out.println(flight);
        }

    }

    public void addFlights(String id, String dep, String des) {

        String flight = this.printPlaneInfo(id) + " (" + dep + "-" + des + ")";
        this.flights.add(flight);

    }

}
