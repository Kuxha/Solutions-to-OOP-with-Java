package moving.domain;

import java.util.ArrayList;

import java.util.List;

public class Box implements Thing {

    private List<Thing> things = new ArrayList<Thing>();

    private int maximumCapacity;

    public Box(int maximumCapacity) {

        this.maximumCapacity = maximumCapacity;

    }

    public boolean addThing(Thing thing) {

            // imp . it means we add the volume of new thing to be added , and our old vol and check if its more than themaxCap or not
        if (getVolume() + thing.getVolume() > this.maximumCapacity) {

            return false;

        }

        this.things.add(thing);

        return true;

    }

    @Override

    public int getVolume() {

        int weight = 0;

        for (Thing t : this.things) {

            weight += t.getVolume();

        }

        return weight;

    }

}
