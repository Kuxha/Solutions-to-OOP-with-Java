
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player implements Comparable<Player> {

    private String name;
    private List<Integer> lengthOfJump;
    private int judge[];
    private int points;

    public Player(String name) {

        this.judge = new int[5];
        this.points = 0;
        this.lengthOfJump = new ArrayList<Integer>();
        this.name = name;

    }

    public void jump() {

        Random random = new Random();
        int length = random.nextInt(60) + 60;
        this.lengthOfJump.add(length);
        int min = 21;
        int max = 5;
        for (int i = 0; i < 5; i++) {

            this.judge[i] = random.nextInt(10) + 10;

            if (this.judge[i] > max) {
                max = this.judge[i];
            }
            if (this.judge[i] < min) {
                min = this.judge[i];
            }
            this.points += this.judge[i];

        }
        this.points = this.points - max - min + length;

    }

    public void jumps() {

        String len = "";
        int k = 0;

        for (Integer length : this.lengthOfJump) {

            if (k < this.lengthOfJump.size() - 1) {

                len = len + length + " m,";

            } else {

                len = len + length + " m";
            }
            k++;
        }
        System.out.println("            jump lengths: "
                + len);

    }

    public String name() {
        return this.name;
    }

    public int points() {
        return this.points;
    }

    public int lengthOfJump() {

        return this.lengthOfJump.get(this.lengthOfJump.size() - 1);
    }

    public void judgeVotes() {

        System.out.println("    judge votes: [" + this.judge[0] + ","
                + this.judge[1] + "," + this.judge[2] + "," + this.judge[3] + ","
                + this.judge[4] + "]");

    }

    @Override

    public int compareTo(Player other) {

        if (this.points() > other.points()) {
            return -1;
        } else if (this.points() < other.points()) {
            return +1;
        } else {
            return 0;

        }

    }

}
