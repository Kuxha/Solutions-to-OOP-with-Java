package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Organism> group;

    public Group() {

        this.group = new ArrayList<Organism>();
    }

    public String toString() {
        String group = "";

        for (Object organism : this.group) {

            group += organism.toString() + "\n";

        }
        return group;
    }

    public void addToGroup(Movable movable) {

        this.group.add((Organism) movable);
    }

    public void move(int dx, int dy) {

        for (Organism organism : this.group) {

            organism.move(dx, dy);

        }

    }

}
