
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxwt;
    private int weight;

    public Suitcase(int maxwt) {
        this.weight = 0;
        this.things = new ArrayList<Thing>();
        this.maxwt = maxwt;

    }

    public void addThing(Thing thing) {
        int newwt = this.weight + thing.getWeight();
        if (newwt <= this.maxwt) {
            this.things.add(thing);
            this.weight = newwt;
        }

    }

    public String toString() {

        int count = this.things.size();
        switch (count) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return "1 thing (" + this.weight + " kg)";
            default:
                return count + " things (" + this.weight + " kg)";
        }
    }

    public void printThings() {

        for (Thing thing : this.things) {
            System.out.println(thing.toString());
        }

    }

    public int totalWeight() {
        return this.weight;
    }

    public Thing heaviestThing() {

        if (this.things.size() == 0) {
            return null;
        }
        int hweight = 0;
        Thing hthing = new Thing("", 0);
        for (Thing thing : this.things) {
            if (hweight < thing.getWeight()) {
                hweight = thing.getWeight();
                hthing = thing;
            }
        }

        return hthing;
    }

}
