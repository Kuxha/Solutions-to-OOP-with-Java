package dungeon;

public class Player {

    private int x, y;

    public Player(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void moveUp() {
        this.x--;

    }

    public void moveDown() {

        this.x++;

    }

    public void moveLeft() {
        this.y--;

    }

    public void moveRight() {
        this.y++;

    }
}
