package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkRobot;

    public Barn(BulkTank tank) {

        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkRobot = milkingRobot;
        this.milkRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (this.milkRobot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }

        this.milkRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {

        if (this.milkRobot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }

        for (Cow cow : cows) {

            this.milkRobot.milk(cow);
        }

    }

    public String toString() {

        return   tank.toString();

    }

}
