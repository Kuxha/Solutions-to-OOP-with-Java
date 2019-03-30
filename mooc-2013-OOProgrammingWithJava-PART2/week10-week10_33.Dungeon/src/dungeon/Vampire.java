package dungeon;

public class Vampire {

    private int x, y;

    public Vampire(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Vampire other) {

        return (this.getX() == other.getX() && this.getY() == other.getY());
    }
}
