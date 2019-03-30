package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxwt;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight) {
        this.maxwt = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for (Thing stuff : this.box) {
            totalWeight += stuff.getWeight();

        }

        totalWeight += thing.getWeight();
        if (totalWeight <= this.maxwt) {
            this.box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
       return box.contains(thing);
    }

}
