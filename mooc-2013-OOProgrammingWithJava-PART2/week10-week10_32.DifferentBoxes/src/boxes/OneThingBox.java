package boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box {

    private List<Thing> oneThingbox;

    public OneThingBox() {

        oneThingbox = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (oneThingbox.isEmpty()) {
            oneThingbox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return oneThingbox.contains(thing);

    }

}
