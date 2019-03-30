package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private List<Cow> cows;
    private String owner;
    private Barn barn;

    public Farm(String owner, Barn barn) {

        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();

        }
    }

    public void manageCows() {

        this.barn.takeCareOf(cows);

    }

    public String toString() {

        String ownerandbarn = "Farm owner: "
                + this.owner
                + "\nBarn bulk tank: "
                + this.barn.getBulkTank().toString()
                + "\nAnimals:\n";
        String animals = "";

        if (this.cows.isEmpty()) {

            animals += "No cows.";
        } else {
            for (Cow cow : cows) {
                animals = "        " + cow.toString();

            }
        }
        return ownerandbarn + animals;

    }

    public void addCow(Cow cow) {
        this.cows.add(cow);

    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);

    }

}
