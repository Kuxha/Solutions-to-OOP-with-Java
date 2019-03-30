package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {

                // we get a random double ok .between 0 and 1. now this number ,if smaller than probabilty of each cell. it turns 
                // that cell to living . 
                if (new Random().nextDouble() < probabilityForEachCell) {
                    turnToLiving(x, y);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        return insideTheBoard(x, y) && super.getBoard()[x][y] == true;
    }

    @Override
    public void turnToLiving(int x, int y) {

        if (insideTheBoard(x, y)) {
            super.getBoard()[x][y] = true;
        }

    }

    @Override
    public void turnToDead(int x, int y) {
        if (insideTheBoard(x, y)) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int alive = 0;

        if (isAlive(x - 1, y)) {

            alive++;
        }
        if (isAlive(x - 1, y - 1)) {

            alive++;
        }
        if (isAlive(x - 1, y + 1)) {

            alive++;
        }
        if (isAlive(x, y - 1)) {

            alive++;
        }
        if (isAlive(x, y + 1)) {

            alive++;
        }
        if (isAlive(x + 1, y)) {

            alive++;
        }
        if (isAlive(x + 1, y - 1)) {

            alive++;
        }
        if (isAlive(x + 1, y + 1)) {

            alive++;
        }

        return alive;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2) {

            turnToDead(x, y);
        } else if (livingNeighbours == 2) {
            

        } else if (livingNeighbours > 3) {

            turnToDead(x, y);
        }else if (livingNeighbours == 3) {

            turnToLiving(x, y);
        }
    }

    public boolean insideTheBoard(int x, int y) {
        if (x < 0 || y < 0 || x >= super.getWidth() || y >= super.getHeight()) {
            return false;
        }

        return true;
    }
}
