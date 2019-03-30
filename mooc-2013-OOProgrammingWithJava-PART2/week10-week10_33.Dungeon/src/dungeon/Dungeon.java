package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    private int length, height, moves, vampires;
    private Player player;
    private List<Vampire> allVampires;
    private Scanner reader;
    private boolean vampmove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {

        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.player = new Player(0, 0);
        this.reader = new Scanner(System.in);
        this.vampmove = vampiresMove;

        this.allVampires = new ArrayList<Vampire>();

    }

    public void moveVamps() {

        ArrayList<String> vampLocs = new ArrayList<String>();

        for (int i = 0; i < this.vampires; i++) {

            int x = new Random().nextInt(length);
            int y = new Random().nextInt(height);
            String loc = "" + x + y;
            while (vampLocs.contains(loc)) {
                x = new Random().nextInt(length);
                y = new Random().nextInt(height);
                loc = "" + x + y;
            }
            vampLocs.add(loc);

            allVampires.add(new Vampire(x, y));

        }

    }

    public void printDungeon() {

        int printVamps = this.allVampires.size();
        boolean dot = true;
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.length; j++) {

                if (i == player.getX() && j == player.getY()) {
                    dot = false;
                    System.out.print("@");
                } else if (printVamps > 0) {
                    for (Vampire vampire : this.allVampires) {

                        if (vampire.getX() == i && vampire.getY() == j) {
                            System.out.print("v");
                            dot = false;
                            printVamps--;

                        }

                    }

                }

                if (dot) {
                    System.out.print(".");

                }

                dot = true;
            }
            System.out.println("");

        }

    }

    public void command(String com) {

        for (int i = 0; i < com.length(); i++) {

            switch (com.charAt(i)) {
                case 'w': {

                    if (this.player.getX() != 0) {
                        this.player.moveUp();
                    } else {
                        this.player.setX(0);
                    }

                    break;
                }
                case 'a': {
                    if (this.player.getY() != 0) {
                        this.player.moveLeft();
                    } else {
                        this.player.setY(0);
                    }
                    break;
                }
                case 's': {
                    if (this.player.getX() != (this.length - 1)) {
                        this.player.moveDown();
                    } else {
                        this.player.setX(this.length - 1);
                    }
                    break;
                }
                case 'd': {
                    if (this.player.getY() != (this.height - 1)) {
                        this.player.moveRight();
                    } else {
                        this.player.setY(this.height - 1);
                    }
                    break;
                }
                default:
                    break;
            }

        }

    }

    public void run() {

        boolean win = false;
        int flag = 2;
        while (this.moves > 0) {

            if (this.vampmove) {
                flag = 1;
            } else if (!this.vampmove) {
                flag--;
            }

            if (flag > 0) {
                this.moveVamps();
            }

            System.out.println(this.moves + "\n");
            System.out.println("@ " + this.player.getY() + " " + this.player.getX());
            for (Vampire vampire : this.allVampires) {

                System.out.println("v " + vampire.getY() + " " + vampire.getX());

            }
            System.out.println("");
            this.printDungeon();

            System.out.println("\n");
            String com = reader.nextLine();
            this.command(com);

            for (Vampire vamp : this.allVampires) {

                if (this.player.getX() == vamp.getX() && this.player.getY() == vamp.getY()) {
                    this.vampires--;

                }

            }

            if (this.vampires == 0) {

                win = true;
                System.out.println("YOU WIN");
                break;

            }
            this.moves--;
            if (this.vampmove) {
                this.allVampires.clear();
            }

        }

        if (!win) {
            System.out.println("YOU LOSE");
        }
    }

}
