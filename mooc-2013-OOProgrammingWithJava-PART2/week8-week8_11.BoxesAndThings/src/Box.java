
import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxwt;
    private ArrayList<ToBeStored> things;

    public Box(double maxwt) {
        this.things = new ArrayList<ToBeStored>();
        this.maxwt = maxwt;

    }
    
    
    public void add(ToBeStored thing){
    
        double newweight = this.weight() + thing.weight();
        if(newweight<=this.maxwt)
            this.things.add(thing);
            
    
    
    }

    public double weight() {
        double weight = 0;
        // it calculates the total weight of the things which had been stored

        for (ToBeStored thing : this.things) {

            weight += thing.weight();

        }

        return weight;
    }

    public String toString() {

        int no = this.things.size();
        double weight = this.weight();
        return "Box: " + no + " things, total weight " + weight + " kg";

    }

}
